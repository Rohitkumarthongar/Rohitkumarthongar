

public class EmpLinkList
{
    Node start=null;

    public void insert(Node n)
    {

        if(start==null)
        {
            start=n;

        }
        else {

            Node current = start;
            while (current.next != null)
            {
                current=current.next;
            }


            current.next=n;
            System.out.println("NOde inserted at the end");
        }
    }

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
            if(current.getData().getEmpId()==empId)
            {
                System.out.println("empId");
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
            current=current.next;
        }
        System.out.println();
    }
}
