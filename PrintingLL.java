import java.util.*;
import java.util.LinkedList;

import org.w3c.dom.Node;

//import org.w3c.dom.Node;
public class PrintLL {
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

     

    
    public static void main(String[] args){
       PrintLL LL = new PrintLL();
       LL.print();
       LL.addFirst(2);
       LL.print();
       LL.addFirst(1);
       LL.print();
       LL.addLast(3);
       LL.print();
       LL.addLast(4);
       LL.print();
      
    }
}
