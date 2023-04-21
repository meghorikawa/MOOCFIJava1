public class Container {

    private int max;
    private int vol;

    public Container() {
        this.vol = 0;
        this.max = 100;
    }

    public int contains() {
        return this.vol;
    }

    public void add(int amount) {
        if (amount < 0) {
            this.vol = vol + 0;
        }

        else {
            this.vol = vol + amount;
            if (this.vol > max) {
                this.vol = max;
            }
        }

    }

    public void remove(int amount) {
        if (amount < 0) {
            this.vol = vol - 0;
        } else {
            this.vol = vol - amount;

            if (this.vol < 0) {
                this.vol = 0;
            }
        }

    }

    public String toString(){
        return this.vol + "/" + max;
    }
}
