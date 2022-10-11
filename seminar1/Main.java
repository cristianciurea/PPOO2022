package ro.ase.seminar1.exemplu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        float[] preturi1 = {600.5f, 750.5f, 890.9f};

        Masina m1 = new Masina(4, 5, tipVehicul.MASINA,
                "Mercedes", 30000, 2020, "negru", "diesel", preturi1);
        System.out.println(m1.toString());

        Masina m2 = new Masina(8, 2, tipVehicul.CAMION, "Mercedes",
                50000, 2019, "rosu", "diesel", preturi1);
        System.out.println(m2.toString());

        Masina m3 = new Masina(4, 2, tipVehicul.TRACTOR, "New Holland",
                200000, 2021, "verde", "diesel", preturi1);
        System.out.println(m3.toString());

        m2.setPret(33000);
        System.out.println(m2.getPret());

        System.out.println("-----------------------");

        Masina[] vectMasini = {m1, m2};
        for(int i=0;i<vectMasini.length;i++)
            System.out.println(vectMasini[i]);

        System.out.println("-----------------------");

        for(Masina m: vectMasini)
            System.out.println(m.toString());

        System.out.println("-----------------------");

        for(Masina m: vectMasini)
            System.out.println(m.calculPretVanzare());

        for(Masina m: vectMasini)
            System.out.println(m.spuneMarca());



    }
}
