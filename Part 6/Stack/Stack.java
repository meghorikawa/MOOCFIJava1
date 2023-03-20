import java.util.ArrayList;

public class Stack {
   private ArrayList<String> stuff;

    public Stack(){
        this.stuff = new ArrayList<>();
    }

    public boolean isEmpty(){
        return stuff.isEmpty();
    }

    public void add(String value){
        if(!stuff.contains(value)){
            stuff.add(value);
        }
    }

    public ArrayList<String> values(){
        return stuff;
    }

    public String take(){
        String taken = stuff.get(stuff.size()-1);
        stuff.remove(stuff.size()-1);
        return taken;
    }





}
