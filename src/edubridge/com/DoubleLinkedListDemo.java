package edubridge.com;
import java.util.*;
public class DoubleLinkedListDemo {
	
	//A node class for doubly linked list
    class Node{  
        int item;  
        Node previous;  
        Node next;  
   
        public Node(int item) {  
            this.item = item;  
        }

		public int getItem() {
			return item;
		}

		public Node getPrevious() {
			return previous;
		}

		public Node getNext() {
			return next;
		}
        
    }  
    //Initially, heade and tail is set to null
    Node head, tail = null;  
   
    //add a node to the list  
    public void addNode(int item) {  
        //Create a new node  
        Node newNode = new Node(item);  
   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    }  
   
//print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Original  list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    }
    
    public void print4Nodes() {  
        //Node current will point to head  
        Node current = tail.previous;  
        if(tail== null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
     //   System.out.println("Original  list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.item + " ");  
            current = current.next;  
        }
        Node current1 = head;
       System.out.println(current1.item+ " "+  current1.next.getItem()+" "+3);
       //current1 = current1.next;
      // Node temp= current1;
       
        }
        
         


//class Main{
    public static void main(String[] args) {  
        //create a DoublyLinkedList object
        DoubleLinkedListDemo dl_List = new  DoubleLinkedListDemo();  
        //Add nodes to the list  
        dl_List.addNode(1);  
        dl_List.addNode(2);  
        dl_List.addNode(3);  
        dl_List.addNode(4);  
        dl_List.addNode(5);  
   
        //print the nodes of DoublyLinkedList  
        dl_List.printNodes();  
        System.out.println("\n Updated   list: ");
        dl_List.print4Nodes();
    }  
}  