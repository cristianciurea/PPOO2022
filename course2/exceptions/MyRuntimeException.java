
package ro.ase.course2.exceptions;

public class MyRuntimeException 
	extends RuntimeException {
    
    public MyRuntimeException() {
    }

    public MyRuntimeException(String msg) {
        super(msg);
    }
}
