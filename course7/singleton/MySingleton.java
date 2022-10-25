package ro.ase.course7.singleton;

public class MySingleton {

	private static MySingleton instance;
	
    //Create private constructor
	private MySingleton(){
		System.out.println("Instance created...");
	}
	
	//Create a static method to get instance
	public static MySingleton getInstance(){
	     if(instance == null){
	    	 instance = new MySingleton();
	     }
	     return instance;
	}
	     
	public void doSomething(){
	     System.out.println("I am doing something here....");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MySingleton singleton1 = new MySingleton();
		singleton1.doSomething();*/
		MySingleton singleton2 = MySingleton.getInstance();
		singleton2.doSomething();
		MySingleton singleton3 = MySingleton.getInstance();
		singleton3.doSomething();
	}
}
