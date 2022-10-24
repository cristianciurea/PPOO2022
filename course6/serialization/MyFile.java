package ro.ase.course6.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MyFile {

	File fisier;
	String denumire;
	
	public MyFile(String den)
	{
		denumire = den;
	}
	
	public void open()
	{
		fisier = new File(denumire);
	}
	
	public FileOutputStream getOS() throws FileNotFoundException
	{
		return new FileOutputStream(fisier);
	}
	
	public FileInputStream getIS() throws FileNotFoundException 
	{
		return new FileInputStream(fisier);
	}
}
