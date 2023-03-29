public class Item {
    
    private int weight;
    private String name;


    public Item(String aName, int aWeight){
        this.name = aName;
        this.weight = aWeight;
    }

    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }
    
}
