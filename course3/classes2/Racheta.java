
package ro.ase.course3.classes2;

public abstract class Racheta {
    
    int valoare;
    
    public Racheta()
    {
        valoare = 0;
    }
    
    public Racheta(int v)
    {
        valoare = v;
    }
    
    public abstract void doSomething();
}
