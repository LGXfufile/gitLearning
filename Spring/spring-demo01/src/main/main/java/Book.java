package main.main.java;

public class Book {

    private String bookName;
    private String Author;

    public Book() {
        System.out.println("This is Book constructor");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        System.out.println("This is Book setBookName().");
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        System.out.println("This is Book setAuthor().");
        Author = author;
    }

    public void print() {
        System.out.println("打印方法");
    }

}