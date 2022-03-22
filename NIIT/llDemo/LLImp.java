package llDemo;

public class LLImp
{
    public static void main(String[] args) {
        Student s=new Student(01,"abc");
        Node n1=new Node(s);

        Student s1=new Student(02,"def");
        Node n2=new Node(s1);

        Node n3=new Node(new Student(03,"pqr"));
        Node n4=new Node(new Student(05,"xyz"));

        StudLinkedList sl=new StudLinkedList();
        sl.insert(n1);
        sl.insert(n2);
        sl.insert(n3);
        sl.insert(n4);

        sl.traverse();

        sl.search(8);

        sl.delete();
        sl.traverse();




    }
}
