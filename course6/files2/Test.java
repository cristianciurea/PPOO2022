package ro.ase.course6.files2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		
		//Group g = new Group(new Student(11, "Gigel"), new Student(22, "Costel"));
		Student[] vs = {new Student(11, "Gigel"), new Student(22, "Costel"), new Student(33, "Dorel")}; 
		Group g = new Group(vs);
        System.out.println("Initial: " + g);
        
        // Serializare.
        ObjectOutputStream os = null;
        try {
                os = new ObjectOutputStream(new FileOutputStream("out.bin"));
                os.writeObject(g);
        }
        catch (IOException e) 
        {
                e.printStackTrace();
        }
        finally 
        {
             if (os != null)
                try 
             	{
                     os.close();
                }
                catch (IOException e) 
                { 
                	e.printStackTrace();
                }
        }
        
        // Deserializare.
        ObjectInputStream is = null;
        try {
                is = new ObjectInputStream(new FileInputStream("out.bin"));
                g = (Group)is.readObject();
                System.out.println("Deserialized: " + g);
        }
        catch (IOException e) 
        {
                e.printStackTrace();
        }
        catch (ClassNotFoundException e) 
        {
                e.printStackTrace();
        }
        finally 
        {
            if (is != null)
                try 
            	{
                     is.close();
                }
                catch (IOException e) 
                { 
                	e.printStackTrace();
                }
        }
	}

}
