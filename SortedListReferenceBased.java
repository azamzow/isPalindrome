// ********************************************************
// Reference-based implementation of the ADT Sorted List.
// *********************************************************
 /**
 * class SortedListReferenceBased
 *
 *    A class that implements ListInterface using Singly-Linked List (SLL)
 *
 */

public class SortedListReferenceBased implements ListInterface
{
	private Node head;
  	private int numItems;  // number of items in list


  	public SortedListReferenceBased()
  	// creates an empty list
  	{
  		numItems = 0;
		head = null;

  	}  // end default constructor

  	public boolean isEmpty()
  	// Determines whether a list is empty
  	{
  		return (numItems == 0);
  	} // end isEmpty

  	public int size()
  	// Returns the number of items that are in a list
  	{
  		return numItems;
  	}  // end size

  	public void removeAll()
  	// Removes all the items in the list
  	{
  		head = null;
        numItems = 0;

  	} // end removeAll

  	public Object get(int index) throws ListIndexOutOfBoundsException
  	// Retrieves the item at position index of a sorted list, if 0 <= index < size().
  	// The list is left unchanged by this operation.
  	// Throws an exception when index is out of range.
  	{
  		if (index >= 0 && index < numItems) {
  	      // get reference to node, then data in node
  	      Node curr = find(index);
  	      Object dataItem = curr.getItem();
  	      return dataItem;
  	    }
  	    else {
			throw new ListIndexOutOfBoundsException(index + " is an invalid index");
		}
	}


  	public void add(int index, Object item) throws ListException {
  		if (index >= 0 && index <= numItems) {
  			if (index == 0) {
  // insert the new node containing item at
  // beginning of list
  				Node newNode = new Node(item, head);
  				head = newNode;
  			}
  			else {
  				Node prev = find(index-1);
  // insert the new node containing item after
  // the node that prev references
  				Node newNode = new Node(item, prev.getNext());
  				prev.setNext(newNode);
  			} // end if
  			numItems++;
  		}
  		else {
  			throw new ListIndexOutOfBoundsException("List index out of bounds on add");
  		} // end if
  	}  // end add
  	
  	public void remove(int index) throws ListException {
  		if (index >= 0 && index < numItems) {
  			if (index == 0) {
// delete the first node from the list
  				head = head.getNext();
  			}
  			else {
  				Node prev = find(index-1);
  				Node curr = prev.getNext();
  				prev.setNext(curr.getNext());
  			} // end if
  			numItems--;
  		} // end if
  		else {
			throw new ListException("Remove " + index + " from List failed:  " );
		}
	}

  	public int locateIndexToAdd(Object item)
  	// Returns the position where the item belongs or exists in a sorted list;
  	// item and the list are unchanged.
  	{
  		 for(int i = 0;  i < this.size(); i++)
         {
             if (((String) this.get(i)).compareTo((String)item)>0)
             {
                 return i;
             }
         }
         return this.size();
	}


//  	public int locateIndexToRemove(String item)
  	public int locateIndexToRemove(Object item)
  	{
  		for (int i = 0; i < this.size(); i++)
		{
			if(this.get(i).equals(item))
			{
				return i;
			}
		}
		return -1;
	}

	// From Ch. 5
  	public void add(Object item) {
  	// Inserts item into its proper position in a sorted list
  	// Throws an exception if the item connot be placed on the list
		{
			this.add(locateIndexToAdd(item) , item);
		}

	}
	// From Ch. 5
  	public void remove(Object item) {
  	// Removes the item from a sorted list.
  	// Throws an exception if the item is not found.
		
			if(locateIndexToRemove(item) != -1) {
				this.remove(locateIndexToRemove(item));
			}
		
  	}
	// From Ch. 5
	private Node find(int index)
	{
		Node curr = head; // 1st node
		for (int i = 0; i < index; i++) {
		curr = curr.getNext( );
		}
		return curr;
		}

}  // end SortedListReferenceBased

