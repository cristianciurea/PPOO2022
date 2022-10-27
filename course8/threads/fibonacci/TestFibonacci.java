package ro.ase.course8.threads.fibonacci;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class TestFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pis = new PipedInputStream(pos);
			
			//producatorul produce valori pe baza formulei f(n) = f(n-1)+f(n-2)
			//consumatorul consuma valorile produse anterior
			FibonacciProducer fp = new FibonacciProducer(pos, 10);
			FibonacciConsumer fc = new FibonacciConsumer(pis);
			
			fp.start();
			fc.start();
		}
		catch(IOException err)
		{
			err.printStackTrace();
		}
	}
}
