package demoStack;

public class Node {

    Book data;
    Node next;

    public Node(Book data) {
        this.data = data;
        next=null;
    }
    public Book getData() {
        return data;
    }

    public void setData(Book data) {
        this.data = data;
    }
}
