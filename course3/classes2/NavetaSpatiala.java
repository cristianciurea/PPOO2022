
package ro.ase.course3.classes2;

public class NavetaSpatiala extends Avion {
    
    public int viteza;
    
    public NavetaSpatiala()
    {
        super();
        viteza = 0;
    }
    
    public NavetaSpatiala(int s, String d, int v, int vit)
    {
        super(s, d, v);
        viteza = vit;
    }
   
    @Override
    public String toString(){
        return serie + " " + denumire + " " + viteza + " " + valoare;
    }
}
