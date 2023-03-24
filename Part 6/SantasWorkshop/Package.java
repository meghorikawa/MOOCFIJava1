import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> gifts;
    
    //constructor
    public Package (){
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift){
        gifts.add(gift);
    }

    public int totalWeight(){
        int total=0;
        for (Gift i: gifts){
            total = total + i.getWeight();
        }
        return total;
    }

}
