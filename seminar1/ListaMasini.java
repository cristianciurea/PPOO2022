package ro.ase.seminar1.exemplu;

import java.util.ArrayList;
import java.util.List;

/**
 * Clasa pentru a stoca colectie de oviecte Masina
 * @author Cristian
 * @version 1.0
 */

public class ListaMasini {

    List<Masina> listaMasini = new ArrayList<>();

    /**
     * metoda pentru adaugare element nou in colectie
     * @param m - elementul nou de adaugat
     */
    private void adaugaMasina(Masina m)
    {
        listaMasini.add(m);
    }

    /**
     * metoda pentru stergere element din colectie
     * @param m - elementul de sters
     */
    private void stergeMasina(Masina m)
    {
        listaMasini.remove(m);
    }

    /**
     * metoda pentru afisare colectie de obiecte
     */
    private void afisareListaMasini()
    {
        for(Masina m: listaMasini)
            System.out.println(m);
    }
}
