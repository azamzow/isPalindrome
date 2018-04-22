public class QueueReferenceBased implements QueueInterface
{
  private Node lastNode;

  public QueueReferenceBased()
  {
    lastNode = null;
  }  // end default constructor

  // queue operations:
  public boolean isEmpty() {
	  return (lastNode == null);
  }  // end isEmpty

  public void dequeueAll()
  {
    lastNode = null;
  }  // end dequeueAll

  public void enqueue(Object newItem)
  {
	  Node newNode = new Node(newItem);
	  if (isEmpty( )) newNode.setNext(newNode);
	  else
	  {
		  newNode.setNext(lastNode.getNext( ));
		  lastNode.setNext(newNode);
		  }
	  lastNode = newNode;  // new node is at back
  }  // end enqueue

  public Object dequeue() throws QueueException
  {
	  if (!isEmpty( )) {
		  Node firstNode = lastNode.getNext( );
		  if (firstNode == lastNode) { // special case?
			  lastNode = null;  // only one node in queue
			  } 
		  else{  // more than one item
			  lastNode.setNext(firstNode.getNext( ));
			  }
		  return firstNode.getItem( );
		  } else {
      throw new QueueException("QueueException on dequeue: Queue empty");
    }  // end if
  }  // end dequeue

  public Object peek() throws QueueException
  {
	  if (!isEmpty( )) {// lastNode.getNext( ) is the first node
		  return 
				  lastNode.getNext( ).getItem( );
		  } else {
      throw new QueueException("QueueException on peek: Queue empty");
    }  // end if
  }  // end peek


  public String toString()
  {
	  return null;
  } // end of toString

} // end QueueReferenceBased
