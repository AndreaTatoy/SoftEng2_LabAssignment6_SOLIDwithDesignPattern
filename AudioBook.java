public class AudioBook implements Borrowable {
    private String title;

    public AudioBook(String title){
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow() {
        System.out.println("Playing audiobook: " + title);
    }

    @Override
    public String toString(){
        return title;
    }
}
