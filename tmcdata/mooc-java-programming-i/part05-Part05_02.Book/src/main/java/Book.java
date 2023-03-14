public class Book {
    
    private String author;
    private String title;
    private int pages;

    //constructor method
    public Book(String author, String title, int pages ){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    public String getAuthor(){
        return author;
    }

    public String getName(){
        return title;
    }

    public int getPages(){
        return pages;
    }


    //toString method
    public String toString(){
        return author +", " + title + ", " + pages + " pages";
    }
}
