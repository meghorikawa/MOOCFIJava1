
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition){
        int newEuros = this.euros + addition.euros;

        int newCents = this.cents + addition.cents;

        if (newCents > 99){
            newCents = cents - 100;
            newEuros = newEuros+1;
        }

        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public Money minus(Money decreaseBy){
        int newEuros = this.euros - decreaseBy.euros;

        int newCents = this.cents - decreaseBy.cents;

        if (newCents < 0 || newEuros <0 ){
            newEuros = newEuros-1;
            newCents = 100 + newCents;
            if (newEuros < 0){
                newEuros = 0;
                newCents = 0;
            }
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }


    public boolean lessThan(Money compared){
        //if storage location is the same, they are equal
        if (this == compared){
            return true;
        }
        
        if (!(compared instanceof Money)){
            return false;
        }

        if (this.euros() < compared.euros()){
            return true;
        }
        if (this.euros() == compared.euros && this.cents() < compared.cents()){
            return true;
        }

        return false;

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
