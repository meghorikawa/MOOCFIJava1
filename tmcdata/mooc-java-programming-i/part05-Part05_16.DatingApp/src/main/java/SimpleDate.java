
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

    //advance the day by one
    public void advance(){
        this.day ++;
        
        if (this.day > 30){
            this.day =1;
            this.month++;
            if (this.month > 12){
                this.month=1;
                this.year++;
            }
        }


    }

    //advance with parameter
    public void advance (int howMany){
        for (int i=1 ; i <= howMany; i++){
            this.advance();
        }
    }

    public SimpleDate afterNumberOfDays (int days){
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        newDate.advance(days);

        return newDate;
    }

}
