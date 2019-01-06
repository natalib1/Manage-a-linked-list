/*  Generic Linked List
 *  Person 
 *  Natali Boniel, 201122140 */

package Q1;

public class Person  implements Comparable<Person>{

	private String name;
	private int id;
	private int birthYear;
	
	public Person(String name, int id,int birthYear)
	{
        this.name = name;
        this.id = id;
        this.birthYear = birthYear;
    }
    
    public String toString(){
        return "\nName: \t" + name + ",\tId: \t" + id + ",\tBirth Year: \t" + birthYear;
    }
	
	public int compareTo(Person p) {
		if(birthYear < p.birthYear)
            return 1;
        else 
        	return 0;
	}

}
