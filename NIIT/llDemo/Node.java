package llDemo;

public class Node
{
    Student data;
    Node next=null;//Self referencing object

    public Node(Student data)
    {
        this.data = data;
    }

    public Student getData()
    {
        return data;
    }

    public void setData(Student data) {
        this.data = data;
    }
}
