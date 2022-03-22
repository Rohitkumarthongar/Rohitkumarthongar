package demoStack;

import demoStack.Node;
import demoStack.Book;
import demoStack.BookStack;
public class Main {

    public static void main(String[] args) {
        Node n1=new Node(new Book(101,"Allen","Physics","Darwin"));
        Node n2=new Node(new Book(102,"Akash","Chemistry","zorgeBUss"));
        Node n3=new Node(new Book(103,"BAnsal","MAth","A.Rhmaan"));
        Node n4=new Node(new Book(104,"NUclear","OPS","Moossa"));
        Node n5=new Node(new Book(105,"Proton","Corna","Dan"));
        Node n6=new Node(new Book(106,"Srk","Phys","win"));
        BookStack BS=new BookStack();
        BS.push(n1);
        BS.push(n2);
        BS.push(n3);
        BS.push(n4);
        BS.push(n5);
        BS.push(n6);
        BS.traverse();
        BS.pop();
        BS.pop();
        BS.traverse();
    }}