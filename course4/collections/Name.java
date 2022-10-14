package ro.ase.course4.collections;

public class Name extends Identity implements Comparable<Name>, Cloneable {

	private String firstName, lastName;

	public Name()
	{
		super();
		firstName = "prenume";
		lastName = "nume";
	}
	
	public Name(String id, String firstName, String lastName) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int compareTo(Name n) {
		// TODO Auto-generated method stub
		int lastCmp = lastName.compareTo(n.lastName);
		if (lastCmp==0)
			lastCmp = firstName.compareTo(n.firstName);
		return lastCmp;
		//return(lastCmp==0 ? firstName.compareTo(n.firstName):lastCmp);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId()+ " "+ this.firstName + " " + this.lastName;
	}

	@Override
	public void sayMyName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Your name is: "+name);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Name n = (Name)obj;
		return n.lastName.equals(lastName) && n.firstName.equals(firstName);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 31*firstName.hashCode() + lastName.hashCode();
	}
	
	/*@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Name n = new Name(this.getId(), this.firstName, this.lastName);
		return n;
	}*/
	
	@Override
	protected Name clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Name)super.clone();
	}
}
