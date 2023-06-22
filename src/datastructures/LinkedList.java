package datastructures;

class LinkedList {
    Node head; // head of list
  
    /* Linked list Node.  This inner class is made static so
       that main() can access it */
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        } // Constructor
    }
    
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    
    public void insertNode(int new_data)
    {
    
    	 Node new_node = new Node(new_data);
    	 new_node.next = head;
    	 head = new_node;
    }
    
    public void append(int new_data)
    {
        /* 1. Allocate the Node &
           2. Put in the data
           3. Set next as null */
        Node new_node = new Node(new_data);
 
        /* 4. If the Linked List is empty, then make the
              new node as head */
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
 
        /* 4. This new node is going to be the last node, so
              make next of it as null */
        new_node.next = null;
 
        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;
 
        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }
    
    
    public void insertAfter(Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println(
                "The given previous node cannot be null");
            return;
        }
     
        /* 2. Allocate the Node &
        3. Put in the data*/
        Node new_node = new Node(new_data);
     
        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;
     
        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }
    
    
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		
//		llist.head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
//        llist.head.next = second;
//        second.next = third;
//      if()
//        	llist.insertNode(0);
//       
//        
//        llist.printList();
//		
	}

}
