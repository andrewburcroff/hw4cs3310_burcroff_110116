package burcroffLinkedList;

public class burcroffLinkedListClass {
	Node head = null;
	Node tail = null;
	Node first;
	private Node Start;
	private int size =0;
	
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void bubbleSort(Node f)
	{
	  first =f;
	  System.out.println(first.getNext().getValue());
	  for (int i = 0; i < size; i++)
	  {
	    for (int j = i; j < size; j++)
	    {
	       if ((int)first.getValue().charAt(0) > (int)first.next.getValue().charAt(0))
	       {
	          swap(first, first.next);
	       }
	    }
	  }
	}

	public Node elementAt(String value)
	{
	   Node temp = first;
	   for (int i = 0; i < size; i++)
	   {
		  if(temp.getValue() == value){
			    return temp;
		  }
		  else{
			  temp = temp.getNext();
		  }	  
	   }
	   return null;
	}

	public void swap(Node firstIndex, Node secondIndex)
	{
	   Node secondNext = secondIndex.getNext();       
	   Node second = secondIndex;
	   Node first = firstIndex;
	   Node firstPrevious = first.getPrevious();
	   firstPrevious.setNext(second);
	   first.setNext(secondNext);
	   second.setNext(first);
	}

	public static void mergeSort() {

	}

	public static void insertionSort() {

	}

	public static void selectionSort() {

	}

	public void show(){
		Node current = head;
		if(head == null){
		}
		else{
			while(current.next != null){
	    		System.out.print(current.getString() + " ");
	    		current = current.next;
	    	}
		}		
	}

	public void add(String line) {
		Node current = head;
		Node foundNode = new Node(null);
		Node node = new Node(line);
	    if(size == 0)
	    {
	        Start = new Node(line);
	    }
	    else if(head != null){
	    	
	    	while(current.next != null){
	    		current = current.next;
	    		//foundNode.next = new Node(line);
	    		//foundNode.next.previous = foundNode;
	    		//size++;
	    	}
	    	current.next = node;
	    	node.previous = current; 
	    }
	    size++;
	}
}
