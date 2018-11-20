package factory.book;

public class BiographyBook implements Book
{

    @Override
    public void displayTitle() {
        System.out.println("Teaching Rubber Ducks to Fly: The Story of Joe OO. Genius");
    }
}
