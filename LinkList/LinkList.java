package LinkList;
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
        System.out.println("null");

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

    public void DeleteFirst(){
        if(head == null){
            System.out.println("the list is empty");
        }
        head.next = head ; 

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

    public void DeleteLast(){
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        
        Node currentNode = head;
        while(currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
    }


    public void Addindex(String data , int pos){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;

        }

        if(pos==0){
            newnode.next= head;
            head = newnode;
            return;
        }
       
        Node temp = head ; 
        int index =0 ;
        while(temp!=null && index<pos-1){
            temp = temp.next;
            index++;
        }

        if(temp==null){
            temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
        }
        
        newnode.next = temp.next;
        temp.next = newnode;
    }



    public static void main(String[] args){
        LinkList list = new LinkList();
        list.AddFirst("a");
        list.AddFirst("b");
        list.PrintList();
        list.Addindex("d", 2);
        list.PrintList();
        list.Addindex("e", 2);
        list.PrintList();



    }
}
