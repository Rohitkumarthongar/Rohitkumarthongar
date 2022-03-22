public class Node {
    Employee data;
    Node next=null;
    public void Node(Employee data )
    {
        this.data=data;
    }
    public Employee getData() {
        return data;
    }

    public void setData(Employee data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
