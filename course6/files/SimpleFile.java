package ro.ase.course6.files;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class SimpleFile {

	File myFile;
	String fileName;
	
	public SimpleFile(String name)
	{
		fileName = name;
	}
	
	public boolean open()
	{
		myFile = new File(fileName);
		if (myFile.exists())
			return true;
		else
			return false;
	}
	
	public String caleFisier() throws IOException
	{
		myFile = new File(fileName);
		if (myFile.exists())
			return myFile.getCanonicalPath();
		else
			return null;
	}
	
	public String ReadLine()
	{
		String result = null;
		try
		{
			FileInputStream fluxIn = new FileInputStream(myFile); //pasul 1
			InputStreamReader isr = new InputStreamReader(fluxIn); //pasul 2
			BufferedReader bufferIn = new BufferedReader(isr); //pasul 3
			//DataInputStream dateIn = new DataInputStream(fluxIn);
			StringBuffer sbuf = new StringBuffer();
			while ((bufferIn.readLine())!=null)
				sbuf.append(bufferIn.readLine());
			//result = dateIn.readLine();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		return result;
	}
	
	public boolean CopyFile()
	{
		if (myFile!=null)
		{
			try
			{
				FileInputStream fluxIn = new FileInputStream(myFile);
				File outFile = new File("CopyOf"+fileName);
				FileOutputStream fluxOut = new FileOutputStream(outFile);
				
				byte b;
				while ((b=(byte)fluxIn.read())!=-1){
					fluxOut.write(b);
				}
				fluxIn.close();
				fluxOut.close();
				return true;
			}
			catch(IOException ex){
				ex.printStackTrace();
				return false;
			}
		}
		else return false;
	}
	
	public String getDescription()
	{
		if (myFile.canRead())
		{
			StringBuilder sb = new StringBuilder();
			sb.append("Nume fisier = "+myFile.getName()+"\n");
			sb.append("Cale completa = "+myFile.getAbsolutePath()+"\n");
			Date df = new Date(myFile.lastModified());
			sb.append("Modificat la data = "+df+"\n");
			sb.append("Dimensiune = " + myFile.length()+"\n");
			
			return sb.toString();
		}
		else return null;
	}
}
