public class Book {
    private String author;
    private String title;
    private int page;
    
    public Book(String author, String name, int pages) {
        this.author = author;
        this.title = name;
        this.page = pages;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getName() {
        return this.title;
    }
    
    public int getPages() {
        return this.page;
    }
    public String toString() {
        return this.author + ", " + this.title + ", " + this.page + " pages";
    }
}
