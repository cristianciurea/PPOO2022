package ro.ase.course6.files2;

import java.io.Serializable;
import java.util.Arrays;

public class Group implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Student[] students;
    
    /**
     * Construieste o grupa pe baza unor studenti.
     * 
     * @param students
     *                      parametri cu numar variabil. Acestia pot fi pasati in 2 moduri:
     *                      * separandu-i prin virgula:     new Group(s1, s2, s3);
     *                      * sub forma unui vector:        new Group(new Student[] {s1, s2, s3});
     *                      In cadrul constructorului, parametrul este vazut ca un vector. 
     */
    public Group(Student... students) {
            /* Realizam o copie a vectorului, pentru ca modificarile externe
             * asupra acestuia sa nu se reflecte in interiorul clasei.
             */
            this.students = Arrays.copyOf(students, students.length);
    }
    
    @Override
    public String toString() {
            // Necesar pentru a accesa reprezentarile elementelor vectorului.
            return Arrays.deepToString(students);
    }
}
