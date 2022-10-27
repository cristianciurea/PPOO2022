package ro.ase.course8.threads.operations;

import java.util.Arrays;

public class Sortare2 extends Thread {

	public int vector[] = new int[50];
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<vector.length;i++)
			vector[i] = (int)(Math.random()*(100+i));
		
		Arrays.sort(vector);
		
		for(int i=0;i<vector.length;i++)
			System.out.println("Vector 2: "+vector[i]);
		System.out.println("Am terminat sortare 2!");
	}
}
