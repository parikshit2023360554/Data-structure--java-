package LinkList;

import java.util.Set;

public class DoublyLinkList {

    static class Node{
        int data;
        Node next;
        Node prev;
    
        Node(int data){
            this.data = data;
            prev=next=null;        
        }
    }

    // Display the list
    public static void DisplayList(Node head){
        Node temp = head; 
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.err.println();

    }

    // Display the list in reverse order
    public static void DisplayListReverse(Node tail){
        Node temp = tail; 
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.prev; 
        }
        System.out.println();
    }

    public static void main(String args[]){
        Node a = new  Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        a.prev=null;
        a.next = b; 
        b.prev = a;
        b.next = c; 
        c.prev = b;
        c.next = d; 
        d.prev = c;
        d.next= null; 
        DisplayList(a);
        DisplayListReverse(d);
        

    }
}
