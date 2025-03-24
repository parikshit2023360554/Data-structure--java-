package LinkList;



public class DoublyLinkList {
    private static  Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
    
        Node(int data){
            this.data = data;
            prev=next=null;        
        }
    }

    //function of adding first
    public static void AddFirst(int data){
        Node newNode = new Node(data);
        while(head==null){
            head = newNode;
            return;
        }
        newNode.next = head; 
        head.prev=newNode;
        head = newNode;
    }

    //function of adding last 
    public static void AddLast(int data){
        Node newNode = new Node(data);
        while(head==null){
            head = newNode;
            return;
        }
        Node currNode = head ; 
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode.prev = currNode;

    }

    //add in any index position
    public static void AddPosition(int data,int pos){
        Node newnode = new Node(data);
        Node temp = head ; 
        for(int i=0;i>pos-1;i++){
            temp = temp.next;
        }
        Node currNode = temp.next;
        temp.next = newnode;
        newnode.prev = temp ; 
        newnode.next = currNode; 
        currNode.prev = newnode;
    }

    //delete the first node 
    public static void DeleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
            return ;
        }
        head = head.next;  
        if(head!=null){
            head.prev = null;
        }
    }


    //delete the last node 

    public static void DeleteLast(){
        Node temp = head ; 
        if(head==null){
            System.out.println("list is empty");
            return;
        }

        if(head.next==null){
            head = null;
            return;
        }
        while(temp.next.next!=null){
            temp = temp.next;
        }

        temp.next = null;
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

    
    public static void DisplaylistRandomNode(Node random){
        Node temp = random ; 
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next; 
        }
        System.out.println();

    }

    public static void DisplaylistRandomNodeReverse(Node random){
        Node temp = random ; 
        while(temp.next!=null){
            temp = temp.next;
        }

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String args[]){
        AddLast(1);
        AddLast(2);
        AddLast(3);
        AddLast(4);
        DisplayList(head);
        DeleteLast();
        DisplayList(head);
    }
}
