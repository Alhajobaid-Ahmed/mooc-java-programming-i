
public class Books {
    private String title;
    private int pages;
    private int pYear;
    
    public Books(String titl, int page, int year) {
        this.title = titl;
        this.pages = page;
        this.pYear = year;
    }
    public String getTitle() {
        return title;
    }
    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.pYear;
    }
}
