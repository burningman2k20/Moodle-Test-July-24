public class Book {

    String bookName = "";
    String ISBN = "";
    String authorName = "";
    String publisherName = "";

    public Book(String _bookName, String _ISBN, String _author, String _publisher){
        setBookName(_bookName);
        setISBN(_ISBN);
        setAuthor(_author);
        setPublisher(_publisher);
    }

    void setBookName(String _book){
        this.bookName = _book;
    }

    String getBookName(){
        return this.bookName;
    }

    void setISBN(String _isbn){
        this.ISBN = _isbn;
    }

    String getISBN(){
        return this.ISBN;
    }

    void setAuthor(String _author){
        this.authorName = _author;
    }

    String getAuthor(){
        return this.authorName;
    }

    void setPublisher(String _publisher){
        this.publisherName = _publisher;
    }

    String getPublisher(){
        return this.publisherName;
    }

    void DisplayDescription(){
        System.out.printf("Book Name: %18.25s\n", this.getBookName());
        System.out.printf("Book ISBN: %18.25s\n", this.getISBN());
        System.out.printf("Books Author: %9.25s\n", this.getAuthor());
        System.out.printf("Book Published by:\t %.25s\n\n", this.getPublisher());

    }
}
