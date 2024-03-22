package KitapSırala;

public class book implements Comparable<book> {
    private String name;
    private String publishDate;
    private int pageNumber;
    private  String authorName;

    public book(String name, String publishDate, int pageNumber, String authorName) {
        this.name = name;
        this.publishDate = publishDate;
        this.pageNumber = pageNumber;
        this.authorName = authorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public int compareTo(book book) {
        if (this.pageNumber > book.pageNumber) {
            return 1;
        } else if (this.pageNumber == book.pageNumber) {
            return 0;
        } else {
            return -1;
        }
    }
}