package demoQueue;

public class MainQueue
{
    public static void main(String[] args) {
        Node n1=new Node(new Book(122,"Scary...","asda"));
        Node n2=new Node(new Book(134,"Rich Dad..","asdasd"));
        Node n3=new Node(new Book(154,"Poor Lad...","asdasdasdasd"));
        Node n4=new Node(new Book(44,"Platform number 112..","qweqwwe"));


        BookQueue Bq=new BookQueue();
        Bq.insert(n1);
        Bq.insert(n2);
        Bq.insert(n3);
        Bq.insert(n4);

        Bq.traverse();

        Bq.delete();
        Bq.traverse();
    }
}
