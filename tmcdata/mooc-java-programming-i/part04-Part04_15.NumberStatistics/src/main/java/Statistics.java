/*Create a class Statistics that has the following functionality 
(the file for the class is provided in the exercise template):

a method addNumber adds a new number to the statistics
a method getCount tells the number of added numbers

The class does not need to store the added numbers anywhere, it 
is enough for it to remember their count. At this stage, the 
addNumber method can even neglect the numbers being added to the 
statistics, since the only thing being stored is the count of 
numbers added. */

public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        this.sum += number;
        this.count++;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (this.count == 0) {
            return 0;
        } else {
            return (1.0 * sum) / count;
        }
    }

}
