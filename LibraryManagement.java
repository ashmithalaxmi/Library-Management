class LibraryItem {
    private int id;
    private String title;
    private int year;
    public LibraryItem(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
class Book extends LibraryItem {
    private String author;

    public Book(int id, String title, int year, String author) {
        super(id, title, year);
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
class Magazine extends LibraryItem {
    private int issue;
    public Magazine(int id, String title, int year, int issue) {
        super(id, title, year);
        this.issue = issue;
    }
    public int getIssue() {
        return issue;
    }
    public void setIssue(int issue) {
        this.issue = issue;
    }
}

class Main{
    public static void main(String[] args) {
        Book book = new Book(1, "Wednesday", 2022, "F. Scott Fitzgerald");
        Magazine magazine = new Magazine(2, "National Geographic", 2023, 7);
        System.out.println("Book Title: " + book.getTitle());
        System.out.println();
        System.out.println("Author: " + book.getAuthor());
        System.out.println();
        System.out.println("Year: " + book.getYear());
        System.out.println();
        System.out.println("Magazine Title: " + magazine.getTitle());
        System.out.println();
        System.out.println("Issue: " + magazine.getIssue());
        System.out.println();
        System.out.println("Year: " + magazine.getYear());
    }
}