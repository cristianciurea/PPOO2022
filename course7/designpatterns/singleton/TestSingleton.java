package ro.ase.course7.designpatterns.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstanta();
        Singleton singleton2 = Singleton.getInstanta();


        try {
            //singleton connection
            SingletonConnection connection1 = SingletonConnection.getInstance("admin", "admin1234");
            System.out.println(connection1);

            //another connection
            SingletonConnection connection2 = SingletonConnection.getInstance("administrator", "administrator");

        } catch (ExceptionCreateSingletonConnection e) {
            System.out.println("You tried making another connection!");
        }

    }


}
