public class Song {
    private String name;
    private int seconds;

    public Song(String initialName, int initialSeconds){
        this.name = initialName;
        this.seconds = initialSeconds;
    }

    public String name(){
        return name;
    }

    public int length(){
        return seconds;
    }
}
