/*  Generic Linked List
 *  Linked List Class 
 *  Natali Boniel, 201122140 */

package Q1;

public class LinkedList <E>{
	
	private Cell <E> head;
	private Cell <E> tail;
	
	public LinkedList()
	{
		this.head = null;
		this.tail = null;
	}
	
	public Cell<E> getHead()
	{
		return head;
	}
	
	public Cell<E> getTail()
	{
		return tail;
	}
	
	//add cell at the end of the linked list
	public void add(E myCont)
	{
        if(head == null)
        {
        	Cell<E> temp = new Cell<E> (myCont);
            head = temp;
            tail = temp;
        }
        else
        {
        	Cell<E> temp = new Cell<E> (myCont, tail.getNext());
        	tail.setNext(temp);
    		tail = temp;
        } 
	}

	//remove cell from the beginning of the linked list
	public E remove() throws EmptyListException
	{
		if(head == null)
            throw new EmptyListException("List is empty");
		E tempC = head.getCont();
		Cell<E> temp = head.getNext();
		head = temp;
		
		return tempC;
	}
      
	public String toString()
	{
		String s = "";
		for (Cell<E> h = head; h != null; h=h.getNext())
		{
			if (h.getNext() == null)
				s += h.getCont();
			else
				s += h.getCont() + " -> ";
		}
		s += " -| ";
		
		return s;
	}
}
