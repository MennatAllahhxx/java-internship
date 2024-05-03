import java.util.Date;

/**
 * The interface Manageable.
 */
interface Manageable {
    /**
     * Insert.
     *
     * @param title           the title
     * @param author          the author
     * @param publicationYear the publication year
     */
    void insert(String title, String author, Date publicationYear);

    /**
     * Update.
     *
     * @param title  the title
     * @param object the object
     */
    void update(String title, LibraryObject object);

    /**
     * Delete.
     *
     * @param title the title
     */
    void delete(String title);

    /**
     * Display info.
     */
    void displayInfo();
}

/**
 * The type Library object.
 */
abstract class LibraryObject implements Manageable {
    /**
     * The Title.
     */
    String title;
    /**
     * The Author.
     */
    String author;
    /**
     * The Publication year.
     */
    Date publicationYear;

    /**
     * Instantiates a new Library object.
     *
     * @param title           the title
     * @param author          the author
     * @param publicationYear the publication year
     */
    public LibraryObject(String title, String author, Date publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void insert(String title, String author, Date publicationYear) {

    }

    public void update(String title, LibraryObject object) {

    }

    public void delete(String title) {

    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

/**
 * The type Book.
 */
class Book extends LibraryObject {
    /**
     * Instantiates a new Book.
     *
     * @param title           the title
     * @param author          the author
     * @param publicationYear the publication year
     */
    public Book(String title, String author, Date publicationYear) {
        super(title, author, publicationYear);
    }

}

/**
 * The type Magazine.
 */
class Magazine extends LibraryObject {
    /**
     * Instantiates a new Magazine.
     *
     * @param title           the title
     * @param author          the author
     * @param publicationYear the publication year
     */
    public Magazine(String title, String author, Date publicationYear) {
        super(title, author, publicationYear);
    }
}


/**
 * The type Dvd.
 */
class DVD extends LibraryObject {
    /**
     * Instantiates a new Dvd.
     *
     * @param title           the title
     * @param author          the author
     * @param publicationYear the publication year
     */
    public DVD(String title, String author, Date publicationYear) {
        super(title, author, publicationYear);
    }
}