package lesson12.InterfaceAsADeclarationMethod;

public interface Slugs {
    String lesson1 = "/lesson_1";
    String lesson2 = "/lesson_2";

    default void doSth(){
        System.out.println("No data");
    }
    static void doAnotherThing(){
        System.out.println("Another thing");
    }
}
