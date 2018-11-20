package factory.book;

import static factory.book.BookType.FICTION;

public class Library
{
    public Book getBook(BookType type)
    {
        switch(type)
        {
            case FICTION: return new FictionBook();
            case BIOGRAPHY: return new BiographyBook();
            case GRAPHIC_NOVEL: return new GraphicNovelBook();
            default: return null;
        }
    }
}
