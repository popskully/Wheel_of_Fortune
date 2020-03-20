
public class Wheel {

		
	private Node head;
	private Node tail;
	private String Card;
	private String CardType;
	private int CardValue;
	private int RandCard;
	
		
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public String getCard() {
		return Card;
	}

	public void setCard(String card) {
		Card = card;
	}

	public String getCardType() {
		return CardType;
	}

	public void setCardType(String cardType) {
		CardType = cardType;
	}

	public int getCardValue() {
		return CardValue;
	}

	public void setCardValue(int cardValue) {
		CardValue = cardValue;
	}

	public int getRandCard() {
		return RandCard;
	}

	public void setRandCard(int randCard) {
		RandCard = randCard;
	}

	public Wheel() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public boolean isFull() {
		Node temp = new Node();
		if(temp == null) {
			return true;
		}else {
			temp = null;
			return false;
		}
	}
	
	public void addToBack(String data) {
		if(isFull()) {
			System.out.println("List is full");
		}else {
			Node temp = new Node(data);
			if(isEmpty()) {
				head = temp;
				tail = temp;
				head.setNext(temp);
			}else {
				tail.setNext(temp);
				temp.setNext(head);
				tail = temp;
			}
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("List is empty");
		}else {
			head.display();
			Node current = head.getNext();
			while(current != head) {
				current.display();
				current = current.getNext();
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
