
package ro.ase.course2.exceptions;

//definire exceptie de tip checked
public class DeterminantException 
		extends Exception {
    
    public DeterminantException(){
        super();
    }
    
    public DeterminantException(String mesaj){
        super(mesaj);
    }

}
