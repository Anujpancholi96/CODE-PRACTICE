import java.util.LinkedList;

import org.w3c.dom.Node;

public class AddinMIddleofLL {
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

    public void add(int idx, int data){
        Node newNode = new Node(data);
        if(idx == 0){
            addFirst(data);
            return; 
        }
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
       AddinMIddleofLL LL = new AddinMIddleofLL();
       LL.addFirst(2);
       LL.addFirst(1);
       LL.addLast(3);
       LL.addLast(4);

       LL.add(2,9);
       LL.print();

    }
}
