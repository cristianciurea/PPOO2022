package ro.ase.course8.threads.operations;

public class HelloThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			try{
				System.out.println("Hello from a thread!");
				Thread.sleep(2000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Done");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloThread t = new HelloThread();
		t.start();
	}
}
