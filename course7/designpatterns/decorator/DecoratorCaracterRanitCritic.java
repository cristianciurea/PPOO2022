package ro.ase.course7.designpatterns.decorator;

public class DecoratorCaracterRanitCritic extends DecoratorCaractere{

    public DecoratorCaracterRanitCritic(InterfataCaracterJoc caracterJoc) {
        super(caracterJoc);
    }

    @Override
    public void esteAtacat(int puncte) {
        super.esteAtacat(puncte);
        if(this.caracterJoc.getPuncteViata()<100){
            System.out.println("Atentie! Ranit critic!!!");
        }
    }
}
