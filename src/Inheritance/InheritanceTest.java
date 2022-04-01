package Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
         Dog dog=new Dog();
         dog.eat();
         dog.setName("Tom");
         dog.NoofHearts(1);
         dog.bark();
         dog.displayName();
        System.out.println("*************");

         Cat cat=new Cat();
         cat.setName("Mickey");
         cat.NoofHearts(1);
         cat.eat();
         cat.displayName();
        System.out.println("************");

        Octopus octopus=new Octopus();
        octopus.setName("Oct");
        octopus.getNoOfHearts();
        octopus.walk();
        System.out.println("**************");
    }
}
