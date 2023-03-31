import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDo;

    public TodoList() {
        this.toDo = new ArrayList<>();

    }

    public void add(String task) {
        this.toDo.add(task);
    }

    public void print() {
        if (toDo.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            for (int i = 0; i < toDo.size(); i++) {
                int counter = i+ 1;
                System.out.println(counter + ": " + toDo.get(i));
            }
        }
    }

    public void remove(int number){
        toDo.remove(number-1);
    }




}
