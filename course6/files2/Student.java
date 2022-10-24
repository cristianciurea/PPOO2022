package ro.ase.course6.files2;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private /*transient*/ int id;
	private String nume;
    
    public Student(int id, String nume) 
    {
    	this.id = id;
        this.nume = nume;
        System.out.println(nume);
    }
    
    @Override
    public String toString() {
        return "Studentul " + nume + " are id "+id;
    }
}
