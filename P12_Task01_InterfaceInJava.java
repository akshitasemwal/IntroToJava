package Unit_02;

// interface 100% abstract class
interface Animal{
    final int a = 12;
    public void animalSound(); // interface method(does not have a body)
    public void run();         // interface method(does not have a body)
}

// interface
interface Human{
    public void humanSound();  // interface method(does not have a body)
    public void run1();        // interface method(does not have a body)
}

public class P12_Task01_InterfaceInJava {

    public static void main(String[] args) {
        C1 obj = new C1();
        obj.funcA();
        obj.funcB();

        Species obj2 = new Species();
        obj2.animalSound();
    }
}

// Multiple interfaces can be implemented at the same time
class Species implements Animal, Human{
    public void animalSound() {
        System.out.println(a);
        System.out.println("Animal makes a gur gur sound");
    }

    public void run() {
        System.out.println("Animals run faster than Human");
    }

    public void humanSound() {
        System.out.println("Humans can talk.");
    }

    public void run1() {
        System.out.println("Human runs slower than Animals");
    }
}

interface A1{
    void funcA();
}

interface B1 extends A1{
    void funcB();
}

class C1 implements B1{

    public void funcA() {
        System.out.println("Inside function A");
    }

    public void funcB() {
        System.out.println("Inside function B");
    }
}