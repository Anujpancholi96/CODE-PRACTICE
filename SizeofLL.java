import org.w3c.dom.Node;

public class SizeofLL {
    
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
    public static int size;
    public void addFirst(int data){
         Node newNode = new Node(data);
        size++;
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
        size++;
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

    public int removeFirst(){
        if(size == 0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size == 0){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev  : i = size-2
        Node prev = head;   
        for(int i = 0 ; i < size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    public void add(int idx, int data){
        Node newNode = new Node(data);
        if(idx == 0){
            addFirst(data);
            return; 
        }
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx -1; that is  temp = prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args){
       SizeofLL LL = new SizeofLL();
       LL.addFirst(2);
       LL.addFirst(1);
       LL.addLast(4);
       LL.addLast(5);

       LL.add(2,3);
       LL.print();
        System.out.println(LL.size);
          LL.removeFirst();
         LL.print();
         LL.removeLast();
         LL.print();
         System.out.println(LL.size);
         
    }
}
