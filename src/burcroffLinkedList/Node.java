package burcroffLinkedList;

public class Node {
	Node next;
	Node previous;
	Node size;
	String string;//Creating a reference to data.
	String value;
	Node nextNode;

	public Node(String data) 
	{
		this.next = next;//Setting the reference of next to this next.
		this.string = data;//Setting the reference of data to this data.
		this.previous = previous;//Setting the reference to this previous.
		
	}

	public String getString() {
		return string;
	}

	public void setValue(String value){
		this.value = value;//Set the value to this this value.
	}
	
	public String getValue(){
		return value;//Return the value.
	}
	
	public void setPrevious(Node previous) 
	{
		this.previous = previous;//Allowing the reference to be the previous.
	}
		
	public Node getPrevious() 
	{
		return previous;//Returning the previous node.
	}
	
	public void setString(String stringValue)
	{
		string = stringValue;//Setting the data to the current dataValue.
	}
	
	public void setNext(Node nextValue) 
	{
		next = nextValue;//Setting the next to the next value node.
	}
	
	public Node getNext()
	{
	    return next;
	}
	
	public void size (Node size){
		size = size;
		
	}
	public void add(Node a1, Node a2){
		a1.setNext(a2);
		a2.setPrevious(a1);
	}
}
