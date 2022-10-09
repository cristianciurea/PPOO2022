package ro.ase.course3.classes2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {

	double medie;

    public Student1(double avg) {
        this.medie = avg;
    }
        
    @Override
    public String toString() {
        return "[" + medie + "]";
    }
}

class StudentComparator1 implements Comparator<Student1> {
	@Override
	    public int compare(Student1 s1, Student1 s2) {
	        return (int)(s1.medie - s2.medie);
	    }
}

public class StudentTest
{
    public static void main(String[] args) {
        List<Student1> lista = new ArrayList<Student1>();
        lista.add(new Student1(4.5));
        lista.add(new Student1(8.7));
        lista.add(new Student1(5.9));
        lista.add(new Student1(9.5));
        lista.add(new Student1(4.9));
          
        Collections.sort(lista, new StudentComparator1());
        System.out.println(lista);
    }	 
}


