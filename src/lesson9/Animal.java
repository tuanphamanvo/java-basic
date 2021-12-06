package lesson9;

public class Animal {

    private String defaultName = "Animal";
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    protected  void speak(){
        System.out.println("Hello there...");
    }
    protected String getName(){
        return this.name;
    }

    protected void printDefaultName(){
        System.out.println("My name is: "+ defaultName);
    }
}
