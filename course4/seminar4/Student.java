package ro.ase.course4.seminar4;

import java.util.Comparator;

public class Student {

    private double medie;

    public Student(double medie) {
        this.medie = medie;
    }

    public double getMedie() {
        return medie;
    }

    public void setMedie(double medie) {
        this.medie = medie;
    }

    @Override
    public String toString() {
        return "Student{" +
                "medie=" + medie +
                '}';
    }

    static class StudentComparator implements Comparator<Student>
    {
        @Override
        public int compare(Student s1, Student s2) {
            //return (int)(s1.medie - s2.medie);
            if(s1.medie < s2.medie)
                return -1;
            else
                if (s1.medie > s2.medie)
                    return 1;
                else
                    return 0;
        }
    }
}
