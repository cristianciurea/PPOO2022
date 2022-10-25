package ro.ase.course7.designpatterns.decorator;

public class TestDecorator {

    public static void main(String[] args) {
        InterfataCaracterJoc superman = new CaracterJoc("Superman",1000);
        InterfataCaracterJoc batman = new CaracterJoc("Batman",1000);

        //in mod normal
        superman.getDescriere();
        superman.esteAtacat(200);
        superman.getDescriere();
        System.out.println("\n---------------------\n");

        //cu decoratorul primeste un scut
        DecoratorCaracterCuScut supermanCuScut = new DecoratorCaracterCuScut(superman,"scut de lemn");
        supermanCuScut.esteAtacat(200);
        supermanCuScut.getDescriere();

        System.out.println("\n---------------------\n");
        //sau
        DecoratorCaracterRanitCritic batmanCuAlerta = new DecoratorCaracterRanitCritic(batman);
        batmanCuAlerta.esteAtacat(990);

    }
}

