import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> itemList = new ArrayList<>();
    private int totalWeight;

    public Suitcase(int aWeight) {
        this.maxWeight = aWeight;
    }

    // method to check that the maxWeight is not exceeded
    public boolean underweight() {
        // calculate total weight
        totalWeight();
        return totalWeight <= this.maxWeight;
    }

    public void addItem(Item item) {
        this.itemList.add(item);
        if (!underweight()) {
            this.itemList.remove(item);
        }
    }

    // method to calculate the total weight of the suitcase
    public int totalWeight() {
        int cnt = 0;
        for (Item i : itemList) {
            cnt = cnt + i.getWeight();
            totalWeight = cnt;
        }
        return totalWeight;
    }

    //method to print all of the items in the suitcase
    public void printItems(){
        for (Item i: itemList){
            System.out.println(i);
        }
        
    }


    //method to return the heaviest item in the suitcase
    public Item heaviestItem(){
        
        if(itemList.isEmpty()){
            return null;
        }

        Item heaviest = itemList.get(0);
        
        for (Item i: itemList){
            if (i.getWeight() >= heaviest.getWeight()){
                heaviest = i;
            }
        }


        return heaviest;
    }


    public String toString() {
        int x = itemList.size();
        if (x == 1) {
            return x + " item (" + totalWeight() + " kg)";
        } 
        if (itemList.isEmpty()){
            return "no items (0 kg)";
        }else {
            return x + " items (" + totalWeight() + " kg)";
        }
    }

}
