import java.util.ArrayList;

public class Hold {
    
    private int max;
    private ArrayList<Suitcase> luggage = new ArrayList<>();

    public Hold(int aWeight){
        this.max = aWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        //first add suitcase to make calculation if over
        luggage.add(suitcase);
        //if over the max remove
        if (!Underweight()){
            luggage.remove(suitcase);
        }
    }

    //a method to check if the total weight in the hold is under the limit
    public Boolean Underweight(){
        return totalKG() <= max;
    }

    //calculate total weight in the hold
    public int totalKG(){
        int total = 0;
        for (Suitcase i: luggage){
            total = total+ i.totalWeight();
        }
        return total;
    }

    public void printItems(){
        for (Suitcase i: luggage){
            i.printItems();
        }
    }

    public String toString(){
        return luggage.size() + " suitcases ("+ totalKG() + " kg)";
    }
}
