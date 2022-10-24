package ro.ase.course6.serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args)
	{
		MyFile mf = new MyFile("fisier.dat");
		
		try
		{
			mf.open();
			FileOutputStream fos = mf.getOS();
			
			Avion a1 = new Avion(900, 80, 35, "Dorel");
			a1.SerializareObiect(new DataOutputStream(fos));
			fos.close();
			
			FileInputStream fis = mf.getIS();
			Avion a2 = new Avion(0, 0, 0, null);
			a2.DeserializareObiect(new DataInputStream(fis));
			fis.close();
			
			System.out.println(a2.toString());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
}
