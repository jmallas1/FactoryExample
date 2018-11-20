package factory.book;

public class FictionBook implements Book
{
    @Override
    public void displayTitle()
    {
        System.out.println("History of SimUDuck vol 1");
    }
}
