package llDemo;

public class StudLinkedList
{
    Node start=null;

    public void insert(Node n)
    {
        //list is empty
        if(start==null)
        {
            start=n;
            System.out.println("Node inserted at location 1");
        }
        else {
            //try to search for last node
            Node current = start;
            while (current.next != null)
            {
                current=current.next;
            }

            //make the last node point to the new node
            current.next=n;
            System.out.println("NOde inserted at the end");
        }
    }
    //delete from start
    public void delete()
    {
        if(start==null)
        {
            System.out.println("No more elements to delete....");
        }
        else
        {
            Node current=start;
            start=start.next;

        }
    }
    public void search(int roll)
    {
        Node current=start;
        while(current!=null)
        {
            if(current.getData().getRollNo()==roll)
            {
                System.out.println("Record found");
                System.out.println(current.getData());
                break;
            }
            current=current.next;
        }

        if(current==null)
        {
            System.out.println("Record not found");
        }

    }
    public void traverse() {
        Node current = start;
        while (current != null)
        {
            System.out.println(current.getData());
            current=current.next;//increment the current pointer
        }
        System.out.println("*********************************");
    }
}
