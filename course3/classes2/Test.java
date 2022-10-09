package ro.ase.course3.classes2;

import java.util.*;

class Student {
    double medie;

    public Student(double avg) {
        this.medie = avg;
    }
        
    @Override
    public String toString() {
        return "[" + medie + "]";
    }
}

class StudentComparator implements Comparator<Student> {
    
	@Override
    public int compare(Student s1, Student s2) {
        return (int)(s1.medie - s2.medie);
    }
}

public class Test {
    public static void main(String[] args) {
        List<Student> lista = new ArrayList<Student>();
        lista.add(new Student(4.5));
        lista.add(new Student(8.7));
        lista.add(new Student(5.9));
        lista.add(new Student(9.5));
        lista.add(new Student(4.9));
          
        Collections.sort(lista, new StudentComparator());
        System.out.println(lista);
    }
}
