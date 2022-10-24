package ro.ase.course6.files;

import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException
	{
		SimpleFile sFile = new SimpleFile("date.txt");
		System.out.println(sFile.caleFisier());
		//File f = new File("date.txt");
		//System.out.println(f.getCanonicalPath());
		sFile.open();
		String continutFisier = sFile.ReadLine();
		System.out.println(continutFisier);
		
		StringTokenizer st = new StringTokenizer(continutFisier);
		int nrCuvinte = st.countTokens();
		System.out.println("In fisier sunt "+nrCuvinte+" cuvinte");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		if (sFile.CopyFile())
		{
			System.out.println("Fisierul a fost copiat!");
		}
		System.out.println(sFile.getDescription());
	}
	
}
