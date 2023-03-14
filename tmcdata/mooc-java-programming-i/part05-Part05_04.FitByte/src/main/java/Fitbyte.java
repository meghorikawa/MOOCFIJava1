public class Fitbyte {

    private int age;
    private int restingHeartRate;

    // constructor method
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }

    public double targetHeartRate(double percentageOfMax) {

        double maxHeartRate = 206.3 - (.711*this.age);
        double targetHeartRate = (maxHeartRate - this.restingHeartRate) * percentageOfMax + this.restingHeartRate;
        return targetHeartRate;
    }

}
