import org.w3c.dom.Node;

public class reverseLL {
     public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null; 
        }
    }
    public  static Node head;
    public  static Node tail;
    public void addFirst(int data){
         Node newNode = new Node(data);
           //create new node
          if(head == null){
            head = tail = newNode;
            return;
        }
       
        //newNode ke next me head daaalo
        newNode.next = head; //linking step

        //now set head = newNode
        head = newNode;
    }
    
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }
    public void  print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args){
        reverseLL LL = new reverseLL();
        LL.addFirst(2);
        LL.addFirst(1);
        LL.addLast(3);
        LL.addLast(4);
        LL.addLast(5);
        LL.print();
        LL.reverse();
        LL.print();
    }
}
