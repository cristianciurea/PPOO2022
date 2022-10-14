package ro.ase.course4.collections;

public class Persoana extends Name implements IVote {

	private String address;
	protected int age;
	public String phone;
	
	public Persoana(String id, String first, String last, 
			String address, int age, String phone) 
	{
		super(id, first, last);
		this.address = address;
		this.age = age;
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId()+ " " +this.getFirstName()+" "+this.getLastName()+" "+
				this.address+" "+this.age+" "+this.phone;
	}

	@Override
	public void voteaza(String partid) {
		// TODO Auto-generated method stub
		System.out.println("Persoana cu numele "+this.getLastName()+" a votat partidul "+partid);
	}
}
