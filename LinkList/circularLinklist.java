package LinkList;

public class circularLinklist {
    Node head ; 
    Node tail;

    class Node{
        int data ; 
        Node next ; 

        Node(int data){
            this.data = data ; 
            this.next = null;
        }

    }

    public void AddFirst(int data){
        Node newnode = new Node(data);
        if(head==null){
            head  = newnode;
            tail = newnode;
            newnode.next = newnode;
        } else{
            newnode.next = head ; 
            head = newnode;
            tail.next = newnode;
        }
    }

    public void AddLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            newnode.next = newnode;
        }else{
            newnode.next = head ; 
            head = newnode;
            tail.next = newnode;
        }
    }

    
}
