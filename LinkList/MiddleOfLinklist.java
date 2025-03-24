package LinkList;

class MiddleOfLinklist{
    static Node head;
    class Node{
        String data; 
        Node next; 

        Node(String data){
            this.data=data;
            this.next= null; 
        }
    }

    public void PrintList(){
        if(head==null){
            System.out.println("list is empty");
            return; 

        }
        Node currNode = head; 
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");

    }


    

    public void AddLast(String data){
        Node newnode =new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newnode;
    }

    public static int FindLength(Node head){
        int counter = 0 ;
        Node temp = head;
        while(temp!=null){
            counter++;
            temp= temp.next;
        }
        return counter ;

    }


    public static String PrintMiddle(Node head){

        int lenght = FindLength(head);
        int middleNode = lenght/2;
        while(middleNode>0){
            head = head.next; 
            middleNode--;
        }
        return  head.data;
        

    }

    public static void main(String[] args) {
        MiddleOfLinklist list = new MiddleOfLinklist();  // Create instance
        list.AddLast("a");
        list.AddLast("b");
        list.AddLast("c");
        list.PrintList();
        int lenghtget = FindLength(head);
        System.out.println(lenghtget);

        String getmiddle = PrintMiddle(head);
        System.out.println(getmiddle);
    }
}
