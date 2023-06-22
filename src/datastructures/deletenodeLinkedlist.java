package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class deletenodeLinkedlist {
	
	Node head; 
	class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		deletenodeLinkedlist list = new deletenodeLinkedlist();
	   
		list.push(7);
		list.push(1);
		list.push(3);
		list.push(2);
		list.push(8);
		
		
		 ArrayList<Integer> arr = new ArrayList<>();
		 Collections.reverse(arr);

		list.printList();
		list.deleteNode(0);
		list.printList();
	}
	
	
	public void push(int new_data) {
		
		 Node new_node = new Node(new_data);
		 
		 new_node.next = head;
		 
		 head = new_node;
		 
	}
	
	public void printList()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println("\n");
    }
	
	void deleteNode(int position)
    {
        // If linked list is empty
        if (head == null)
            return;
 
        // Store head node
        Node temp = head;
 
        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }
 
        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;
 
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
 
        temp.next
            = next; // Unlink the deleted node from list
    }

}
