public class Gift {
    private String name;
    private int weight;

    public Gift(String aName, int aWeight){
        this.name = aName;
        this.weight= aWeight;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    public String toString(){
        return this.name +" (" + this.weight + " kg)";
    }
}
