package ro.ase.course7.designpatterns.singleton;

class ExceptionCreateSingletonConnection extends Exception
{
    public ExceptionCreateSingletonConnection()
    {
        super();
    }
}

public class SingletonConnection {
    String name;
    String password;
    private static SingletonConnection instance = null;

    private SingletonConnection() {

    }

    private SingletonConnection(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static SingletonConnection getInstance(String name, String password) throws ExceptionCreateSingletonConnection {
        if (instance == null) {
            System.out.println("Unique instance created");
            instance = new SingletonConnection(name, password);
        } else {
            if (!name.equals(instance.name)) {
                throw new ExceptionCreateSingletonConnection();
            }
        }

        return instance;
    }

    @Override
    public String toString() {
        return "SingletonConnection{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
