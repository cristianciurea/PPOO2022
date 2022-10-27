package ro.ase.course8.threads.operations;

public class SortareMain {

	public static void main(String[] args) throws InterruptedException {
		
		Sortare1 t1 = new Sortare1();
		/*t1.join(5000); //Waits at most 5000 milliseconds for this thread to die
		t1.setPriority(10);*/
		t1.start();
		//t1.stop();
		int i =0;
		while(t1.isAlive())
			i++;
		System.out.println("Durata t1: "+i);
		/*t1.sleep(2000);
		t1.yield();*/
		
		Sortare2 t2 = new Sortare2();
		//t2.setPriority(5);
		t2.start();
		//t2.stop();
		int j =0;
		while(t2.isAlive())
			j++;
		System.out.println("Durata t2: "+j);
	}
}
