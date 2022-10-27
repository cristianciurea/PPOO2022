package ro.ase.course8.threads.operations;

public class Fir2 {
    public static void main(String args[])
    {
        FirdeExecutie2 fir1=new FirdeExecutie2("Fir 1");
        FirdeExecutie2 fir2=new FirdeExecutie2("Fir 2");
        FirdeExecutie2 fir3=new FirdeExecutie2("Fir 3");
        fir1.setPriority(Thread.MIN_PRIORITY); //1
        fir2.setPriority(Thread.MAX_PRIORITY); //10
        fir3.setPriority(7);
        fir1.start();
        fir2.start();
        fir3.start();
        System.out.println("Revenim la main");
    }
}

class FirdeExecutie2 extends Thread
{
    public FirdeExecutie2(String s)
    {
        super(s);
    }
    public void run()
    {
        String numeFir=getName();
        for(int i=0;i<5;i++)
        {
            //if(numeFir.compareTo("Fir 3")==0) yield();
            System.out.println(numeFir+ " este la pasul "+i);
            try{
                sleep(500);
            }
            catch(InterruptedException e) {System.err.println("Eroare");}
        }
        System.out.println(numeFir+ " s-a terminat");
    }
}
