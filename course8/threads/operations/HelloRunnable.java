package ro.ase.course8.threads.operations;

public class HelloRunnable implements Runnable {

	String arrayMessages[] = {"Hello", "from", "thread"};
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<arrayMessages.length;i++)
		{
			try{
				System.out.println(arrayMessages[i]);
				Thread.sleep(2000);
			}
			catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
		System.out.println("Done!");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new HelloRunnable());
		t.start();
		
		//(new Thread(new HelloRunnable())).start();
	}
}
