/*  Generic Linked List
 *  Main Linked List Class 
 *  Natali Boniel, 201122140 */

package Q1;

import java.util.Scanner;

public class MainLinkedList {
	
	public static void main(String[] args)
	{
		final int SIZE = 6;
		final int PSIZE = 4;
		String sArr[] = new String[SIZE];
		String sString;
		String name;
		int id;
		int birthyear;
		int d;
		
		Scanner sc = new Scanner(System.in);

		//input of list
		LinkedList<String> myList = new LinkedList<String>();
		
		System.out.println("Please enter " + SIZE + " strings");
		for (int i=0; i<SIZE; i++)
		{
			d = i+1;
			System.out.println("Enter string no." + d + ": \t");
			sString = sc.next();
			myList.add(sString);
		}
		System.out.println ("\nThe list of strings:\n" + myList);
		
		//output of the reverse list
		LinkedList<String> myListReverse = new LinkedList<String>();
		
		try
		{ 
			for (int i=SIZE-1; i>=0; i--)
			{
				String rString = myList.remove();
				sArr[i] = rString;
			}
			for (int i=0; i<SIZE; i++)
				myListReverse.add(sArr[i]);
		}
		catch(EmptyListException empty)
		{
		    empty.printStackTrace();
		}  		  
		System.out.println("\nThe reverse list of strings:\n" + myListReverse);	
		
		//input of list of person
		System.out.println("");
		LinkedList<Person> pList = new LinkedList<Person>();
		
		System.out.println("Please enter " + PSIZE + " persons");
		for (int i=0; i<PSIZE; i++)
		{
			d = i+1;
			System.out.println("Enter person no." + d + ":");
			System.out.println("\tEnter name: \t");
			name = sc.next();
			System.out.println("\tEnter id: \t");
			id = sc.nextInt();
			System.out.println("\tEnter birth year: \t");
			birthyear = sc.nextInt();
			pList.add(new Person(name, id, birthyear));
		}
		System.out.println ("The list of persons:\n" +pList);
		
		//maximum person in the list
		System.out.println("");
		Cell<Person> pMaxCell = max(pList);
        System.out.println("The oldest person at the list: \n" + pMaxCell.getCont().toString());
         
 		sc.close();
    }	
	
    public static <E extends Comparable <E>> Cell<E> max(LinkedList<E> list)
    {
	    if(list == null)
	        return null;
	    Cell<E> currentNode = list.getHead();
	    Cell<E> max = list.getHead();
	    while(currentNode!=null){
	        if(currentNode.getCont().compareTo(max.getCont())>0){
	            max = currentNode;
	        }
	        currentNode=currentNode.getNext();
	    }
	    return max;
    }
}


