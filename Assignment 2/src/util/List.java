package util;

public class List {
    public Node head = null;  
    public Node tail = null;  
    
    public static void add(List cl, String data){  
        //Create new node  
        Node newNode = new Node(data);  
        //Checks if the list is empty.  
        if(cl.head == null) {  
             //If list is empty, both head and tail would point to new node.  
            cl.head = newNode;  
            cl.tail = newNode;  
            newNode.next = cl.head;  
        }  
        else {  
            //tail will point to new node.  
           cl.tail.next = newNode;  
            //New node will become new tail.  
            cl.tail = newNode;  
            //Since, it is circular linked list tail will point to head.  
            cl.tail.next = cl.head;  
        }  
    }  

    public void display(int pass) {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else { 
        	System.out.print("Pass "+ pass + ":");
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();
        }  
    }
    
    public void game( int n) {
    	int pass = 1;
    	if(head == null) {  
    		 System.out.println("List is empty");
    	}
         else {
        		 while(head != tail) {
        			 Node prev2 = head;
        			 Node potator = head;
        			 Node temp = head;
        			 display(pass); 
        			 pass++;
        			 for (int i = 2; i < n; i++)
        			 {
        				 prev2 = prev2.next;
        				 potator = prev2.next.next.next;
        				 temp = prev2.next.next;
        				 tail = temp;
        			 }
        			 head = potator;
        			 if (head.next == tail) {
        				winner(prev2, temp);
          				break;
          			}
        			 winner(prev2, temp);
        			 prev2.next = potator;
        			
        		 } 
         }
    } 
    
    public void winner(Node prev2, Node temp) {
    	if (head == tail) {
    		System.out.println("The winner is  " + prev2.next.data); 
    	}
    	else if (head.next == tail) {
    		System.out.println("There are no winners!"); 
    	}
    	else {
    		System.out.println(prev2.next.data + " and " + temp.data + " are out!");	
    	}
    }  
}
