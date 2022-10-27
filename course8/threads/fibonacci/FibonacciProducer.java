package ro.ase.course8.threads.fibonacci;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FibonacciProducer extends Thread {

	private DataOutputStream fluxOut;
	private int nr;
	
	public FibonacciProducer(OutputStream out, int howMany)
	{
		fluxOut = new DataOutputStream(out);
		nr = howMany;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			//f(n) = f(n-1)+f(n-2)
			int f1 = 1;
			int f2 = 1;
			fluxOut.writeInt(f1);
			System.out.println("Producator: "+f2);
			fluxOut.writeInt(f2);
			System.out.println("Producator: "+f2);
			
			for(int i=2;i<nr;i++)
			{
				int temp = f2;
				f2 = f2 + f1;
				f1 = temp;
				
				System.out.println("Producator: "+f2);
				
				if (f2<0) break;
	
				fluxOut.writeInt(f2);
			}
		}
		catch(IOException ex)
		{
			System.err.println(ex);
		}
	}
}
