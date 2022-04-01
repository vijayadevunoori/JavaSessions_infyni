package Inheritance;



public class Animal {
    private String name;
    private int noOfHearts;

 public Animal(){}
    public Animal(String name, int noOfHearts) {
        this.name = name;
        this.noOfHearts = noOfHearts;
    }

    public void eat(){
        System.out.println("now "+name+" is eating ....");
    }
   public void displayName(String name){
       System.out.println();
   }
   public void NoofHearts(int noOfHearts){
       System.out.println();
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfHearts() {
        return noOfHearts;
    }

    public void setNoOfHearts(int noOfHearts) {
        this.noOfHearts = noOfHearts;
    }
}
