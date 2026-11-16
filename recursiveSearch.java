import org.w3c.dom.Node;

public class recursiveSearch {
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
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key){
        return helper(head, key);
    }

    public static  void main(String[] args){
        recursiveSearch LL = new recursiveSearch();
        LL.addFirst(1);
        LL.addFirst(2);
        LL.addFirst(3);
        LL.addFirst(4);
        LL.addFirst(5);
        System.out.println(LL.recursiveSearch(3));
        System.out.println(LL.recursiveSearch(5));
    }
}
