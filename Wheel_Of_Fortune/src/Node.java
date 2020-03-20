
public class Node {
	
	
	private Game_Play data;
	private Node next;
	
	
	public Node() {
		this("");
	}
	
	public Node(String data) {
		this(data,null);
	}
	
	public Node(String data2, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	
	public Game_Play getData() {
		return data;
	}
	public void setData(Game_Play data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + (next==null?"null":"not null") + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}


}
