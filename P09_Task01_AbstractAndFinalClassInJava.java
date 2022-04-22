package Unit_02;

abstract class Bike
{
    int a;
    Bike()
    {
        System.out.println("Inside bike constructor"+a+"\n");
    }
    void display()
    {
        System.out.println("This is display method");
    }
}

class Honda4 extends bike
{
     void run()
     {

     }
}
public class P09_Task01_AbstractAndFinalClassInJava {
    public static void main(String[] args)
    {
        Bike obj=new Honda4();
        obj.display();
    }
}

final class super{
            public int data=30;
            void display()
        {
            System.out.println(data);
        }
        }