package factory.book;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Library libFactory = new Library();
        ArrayList<Book> books = new ArrayList<>();

        books.add(libFactory.getBook(BookType.FICTION));
        books.add(libFactory.getBook(BookType.BIOGRAPHY));
        books.add(libFactory.getBook(BookType.GRAPHIC_NOVEL));

        for (Book someBook: books)
        {
            someBook.displayTitle();
        }
    }
}
