package ro.ase.course3.binding;

class Animal {
        void eat()
        {
            System.out.println("Animal is eating...");
        }
}

public class Dog extends Animal {

        void eat()
        {
            System.out.println("Dog is eating...");
        }

        public static void main(String args[])
        {
            //late binding example
            Animal a1 = new Dog();
            a1.eat();
            //early binding example
            Animal a2 = new Animal();
            a2.eat();
        }
}