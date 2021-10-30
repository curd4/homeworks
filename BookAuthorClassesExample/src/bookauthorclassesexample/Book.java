
package bookauthorclassesexample;


public class Book {

    public Book(String title, int yearwritting, int yearPublish, Author author, String publisher) {
        this.title = title;
        this.yearwritting = yearwritting;
        this.yearPublish = yearPublish;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", yearwritting=" + yearwritting + ", yearPublish=" + yearPublish + ", author=" + author + ", publisher=" + publisher + '}';
    }

    public String getTitle() {
        return title;
    }

    public int getYearwritting() {
        return yearwritting;
    }

    public int getYearPublish() {
        return yearPublish;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    String title;
    int yearwritting;
    int yearPublish;
    Author author;
    String publisher;
}
