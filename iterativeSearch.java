import org.w3c.dom.Node;

public class iterativeSearch {
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
    public int search(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;

        }
        return -1;
    }

    public static  void main(String[] args){
        iterativeSearch LL = new iterativeSearch();
        LL.addFirst(1);
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addFirst(4);
        LL.addFirst(5);
        System.out.print(LL.search(3));
    }
}
