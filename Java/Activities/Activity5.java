package activities;

public class Activity5 {
    public static void main(String[] args) {
        String title = "The Alchemist";
        Book newNovel = new MyBook();
        newNovel.setTitle(title);
        System.out.println(newNovel.getTitle());
    }
}
