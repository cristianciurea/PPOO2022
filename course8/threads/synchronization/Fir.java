package ro.ase.course8.threads.synchronization;

public class Fir extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			try{
				System.out.println("Se incearca o noua retragere...");
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			Cont.extragere((int)(Math.random()*500));
		}
	}
}
