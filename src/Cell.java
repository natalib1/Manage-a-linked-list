/*  Generic Linked List
 *  Cell Class 
 *  Natali Boniel, 201122140 */

package Q1;

public class Cell <E> {
	
	private E cont;
	private Cell <E> next;
	
	public Cell (E cont)
	{
		this.cont = cont;
		this.next = null;
	}
	
	public Cell (E cont, Cell <E> next)
	{
		this.cont = cont;
		this.next = next;
	}
	
	public E getCont()
	{
		return cont;
	}
	
	public Cell<E> getNext()
	{
		return next;
	}
	
	public void setCont(E cont)
	{
		this.cont = cont;
	}
	
	public void setNext(Cell<E> next)
	{
		this.next = next;
	}
}
