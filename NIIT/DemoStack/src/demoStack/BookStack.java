package demoStack;

public class BookStack {

    Node top = null;
    public void push(Node ISBNNo)
    {
        if(top==null)
        {
            top=ISBNNo;
            System.out.println("IT's First");
        }
        else
        {
            ISBNNo.next=top;
            top=ISBNNo;

        }
    }
    public void pop()
    {
        if(top==null)
        {
            System.out.println("Sorry Sktimaan");

        }
        else
        {
            top=top.next;
            System.out.println("GEt lost");
        }
    }
    public void traverse()
    {
        Node current=top;
        while(current!=null)
        {

            System.out.println(current.data);
            current=current.next;
        }
    }
}