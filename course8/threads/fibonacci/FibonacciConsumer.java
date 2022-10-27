package ro.ase.course8.threads.fibonacci;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FibonacciConsumer extends Thread {

	private DataInputStream fluxIn;
	
	public FibonacciConsumer(InputStream in)
	{
		fluxIn = new DataInputStream(in);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			while(true)
				System.out.println("Consumator: "+fluxIn.readInt());
		}
		catch(IOException ex)
		{
			if (ex.getMessage().equals("Pipe broken")|| 
					ex.getMessage().equals("Write end dead"))
			{
				return;
			}
			System.err.println(ex);
		}
	}
}
