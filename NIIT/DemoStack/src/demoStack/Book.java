package demoStack;

public class Book {
    int ISBNNo;
    String Producer;
    String BookName;
    String Writer;
    public Book(int IBSNNo,String Producer,String BookName,String Writer)
    {
        this.ISBNNo=ISBNNo;
        this.Producer=Producer;
        this.BookName=BookName;
        this.Writer=Writer;
    }


    public Book(String bookName) {
        BookName = bookName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }



    public int getISBNNo() {
        return ISBNNo;
    }

    public void setISBNNo(int ISBNNo) {
        this.ISBNNo = ISBNNo;
    }



    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }



    public String getProducer() {
        return Producer;
    }

    public void setProducer(String producer) {
        Producer = producer;
    }
    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                ", ISBNNo=" + ISBNNo +
                ", Writer='" + Writer + '\'' +
                ", Producer='" + Producer + '\'' +
                '}';
    }
}
