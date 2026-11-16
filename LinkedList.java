//import org.w3c.dom.Node;
import java.util.*;

import org.w3c.dom.Node;
public class LinkedList{
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

   
    public static void main(String[] args){
       LinkedList LL = new LinkedList();
       LL.addFirst(2);
       LL.addFirst(1);
       LL.addLast(3);
       LL.addLast(4);
      
    }
}