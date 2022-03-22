package demoQueue;

public class BookQueue {
    Node front=null;
    Node rear=null;
    public void insert(Node ISBNNo)
    {
        if(front==null & rear== null)
        {
            //System.out.println("its empty");
            front=ISBNNo;
            rear=ISBNNo;
        }
        else
        {
            rear.next=ISBNNo;
            rear=ISBNNo;
            System.out.println("insert");
        }
    }
    public void delete()
    {
        if(front==null)
        {
         System.out.println("not have");
        }
        else
        {
            front=front.next;
            System.out.println("Blank");
        }
    }
    public void traverse()
    {
        Node current=front;
        while(current!=null)
        {
            System.out.println(current.getData());
            current=current.next;

        }
    }
}
