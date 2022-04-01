package Inheritance;

public class Dog extends Animal{

    public void displayName(){
        System.out.println("Animal Name is:"+getName());

    }
    public void bark(){
        System.out.println(getName() +"sound is Bho..");
    }
}
