public class Timer {
    
    private ClockHand sec;
    private ClockHand hundSec;

    //constructor method
    public Timer (){
        this.sec = new ClockHand(60);
        this.hundSec = new ClockHand(100);
    }

    //moves the timer forward by one- hundreth of a second
    public void advance(){
        this.hundSec.advance();

        //clockhand is an object so must use .value() to convert it to an int for comparison. 
        if (this.hundSec.value()==0){
            this.sec.advance();
        }
    }

    //to string method
    public String toString(){
        return sec +":" + hundSec;
    }


}
