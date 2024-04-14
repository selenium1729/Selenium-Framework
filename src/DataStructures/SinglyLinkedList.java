package DataStructures;

public class SinglyLinkedList {

	private Node head;
	public static class Node{
		int value;
		Node next;
		Node(int value){
			this.value=value;
		}
	
	}
	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.value + "-->");
			current = current.next;
		}
		System.out.print("null");

	}
public int size() {
	if(head==null) {
		return 0;
	}
	int count=0;
	Node current=head;
	while(current!=null) {
		count++;
		current=current.next;
		
	}
	return count;
};
	
	public static void main(String args[]) {
		SinglyLinkedList sll = new SinglyLinkedList();
		Node first = new Node(10);//-creates a data 10 with null next
		sll.head=first;
		Node second =new Node(12);

		Node third =new Node(16);
		Node fourth =new Node(16);
		first.next=second;//-pointing head to 10 head-->10-->12-->16-->null
		second.next=third;
		third.next=fourth;
		sll.display();
		sll.size();
	}

}
