package LL;
class Node{
	int val ; 
	Node next ;
	public Node(int dataa) {
		val=dataa; 
		next=null;
	}
}
public class LinkedList {
	Node head; 
	public static LinkedList insert(LinkedList l ,int val) {
		Node newnode=new Node(val) ;
		if(l.head==null) {
			l.head=newnode; 
			
		}
		else {
			Node temp=l.head; 
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode ;
		}
		return l ;
		
	}
	public static LinkedList insertfirst(LinkedList l ,int val) {
		Node newnode=new Node(val) ;
		newnode.next=l.head; 
		l.head=newnode; 
		return l ;
		}
	public static LinkedList insertmiddle(LinkedList l ,int val) {
		Node newnode=new Node(val) ;
		if(l.head==null) {
			l.head=newnode; 
			
		}
		else {
			Node temp=l.head; 
			
			int n =0 ;
			while(temp.next!=null) {
				temp=temp.next;
				n+=1;
			}
			int t=0 ; 
			temp=l.head;
			while(t<n/2) {
				temp=temp.next;
				t+=1;
			}
			Node Next =temp.next; 
			temp.next=newnode ;
			newnode.next=Next; 
		}
		return l ;
		
	}
	public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
    
        System.out.print("LinkedList: "); 
    
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.val + " "); 
    
            // Go to next node 
            currNode = currNode.next; 
            
        } 
        System.out.println();
    } 
public static LinkedList deletefirst(LinkedList l) {
Node temp=l.head.next; 
	l.head.next=null; 
	l.head=temp; 
	return l;
		
	}
public static LinkedList deletelast(LinkedList l) {
	Node temp=l.head; 
	while(temp.next.next!=null) {
		temp=temp.next;
	}
	temp.next=null ; 
	return l ; 
	
	
}
public static LinkedList deletemiddle(LinkedList l) {
	Node temp=l.head; 
	
	int n =0 ;
	while(temp.next!=null) {
		temp=temp.next;
		n+=1;
	}
	int t=0 ; 
	temp=l.head;
	while(t<n/2-1) {
		temp=temp.next;
		t+=1;
	}
	Node nn=temp.next.next;
	temp.next.next=null ;
	temp.next=nn;
	return l;
	
}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList(); 
		ll =insert(ll, 3);
		ll =insert(ll, 5);
		ll =insert(ll, 7);
		ll =insert(ll, 9);
		ll =insert(ll, 11);
		ll =insertfirst(ll, 13);


		printList(ll);
		ll=insertmiddle(ll, 4);
		printList(ll);
		ll=deletefirst(ll); 
		printList(ll);
		ll=deletelast(ll); 
		printList(ll);
		ll=deletemiddle(ll); 
		printList(ll);


		
		

	}

}
