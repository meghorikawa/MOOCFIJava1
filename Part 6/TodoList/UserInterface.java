import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private TodoList listA = new TodoList();

    public UserInterface(TodoList aList, Scanner scanner){
        this.scanner = scanner;
        this.listA = aList; 
    }

    public void start(){
        while(true){
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
        
            processCommand(input);
        }

    }

    public void processCommand(String command){
        if (command.equals("add")){
            add();
        }
        if (command.equals("list")){
            list();
        }
        if (command.equals("remove")){
            remove(); 
        }
    }

    public void add(){
        System.out.println("To add: ");
        String addition = scanner.nextLine();
        this.listA.add(addition);
    }

    public void list(){
        listA.print();
    }

    public void remove(){
        System.out.println("Which one is removed? ");
        int index = scanner.nextInt();
        listA.remove(index);
    }


}
