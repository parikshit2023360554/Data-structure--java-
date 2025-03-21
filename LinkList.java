class LinkList{
    Node head;
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

    }

    public void AddFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head ; 
        head = newNode;
    }



    public static void main(String[] args){
        LinkList list = new LinkList();
        list.AddFirst("a");
        list.AddFirst("b");
        list.PrintList();
    }
}
