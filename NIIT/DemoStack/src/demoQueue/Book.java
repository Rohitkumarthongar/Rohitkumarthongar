package demoQueue;

public class Book {
    int ISBNNo;
    String BookName;
    String Subject;

    public Book(int ISBNNo,String BookName,String Subject) {
        this.ISBNNo=ISBNNo;
        this.BookName=BookName;
        this.Subject=Subject;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public int getISBNNo() {
        return ISBNNo;
    }

    public void setISBNNo(int ISBNNo) {
        this.ISBNNo = ISBNNo;
    }
    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                ", Subject='" + Subject + '\'' +
                ", ISBNNo=" + ISBNNo +
                '}';
    }
}
