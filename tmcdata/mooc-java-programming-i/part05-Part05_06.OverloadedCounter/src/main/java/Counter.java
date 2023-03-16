import java.text.BreakIterator;

public class Counter {
    private int value;

    // constructor
    public Counter(int startValue) {
        this.value = startValue;
    }

    // overloaded contructor with no parameters
    public Counter() {
        this(0);
    }

    // return value
    public int value() {
        return this.value;
    }

    // increase the value by 1
    public void increase() {
        this.increase(1);
    }

    // decrease by 1
    public void decrease() {
        this.decrease(1);
    }

    // decrease by given integer
    public void decrease(int minus) {
        if (minus > 0){
            this.value = value - minus;
        }
        

    }

    // increase value by given integer
    public void increase(int plus) {
        if (plus > 0){
            this.value = value + plus;
        }
    }

}
