import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        while (true){
            System.out.print("Title: ");
            String title = s.nextLine();
            if (title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(s.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.valueOf(s.nextLine());
            bookList.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed?");
        String answer = s.nextLine();
        if (answer.equals("everything")){
            for (Book novel : bookList){
                System.out.println(novel);
            }
        }
        if(answer.equals("name")){
            for (Book novel : bookList){
                System.out.println(novel.getTitle());
            }
        }

    }
}
