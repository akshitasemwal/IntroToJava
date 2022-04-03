package Unit_01;

public class P3_Task01_VariablesAndDataTypesInJava {
    static int q=11;
    int p=10;
    public static void main(String args[])
    {
        //valid declarations
        int a,b,c;
        float pi;
        double d;
        char e;

        //valid initializations
        pi=3.14;
        d=20.22d;
        e='v';

        a=10;
        b=10;
        c=10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(pi);
        System.out.println(d);
        System.out.println(e);

        int myNum=5;
        float myFloatNum=11.1f;
        char myLetter='A';
        boolean myBool=true;
        String myText="hello";

        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        //Java variable type conversion and type casting
        double f;
        int i=10;
        f=i;             //Type conversion

        double g=10;
        int j;
        j=(int) g;      //Type casting

        System.out.println(f);
        System.out.println(i);
        System.out.println(g);
        System.out.println(j);

        byte k=10;
        boolean l=true;
        long m=10L;
        float n=1.2f;
        double o=1.2d;

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);

        System.out.println(ABC.J);    //data + functions/methods
        //ABC.display()

        ABC obj1= new ABC;           //creation of new object
        System.out.println(obj1.i++);
        System.out.println(obj1.i);

        ABC obj2= new ABC;           //creation of second object
        System.out.println(obj2.i);

        System.out.println(ABC.j++);
        System.out.println(ABC.j);

        ABC.typeConversionAndTypeCasting();
    }

    int r=10;

    void display()
    {
        int a=5;
        System.out.println("this is display method");
        System.out.println(a);
    }
}

class ABC
{
    static int j=10;       //class variable/static variable
    int i=10;              //instance variable

    static void display()
    {
        int a=5;
        System.out.println("this is display method");
        System.out.println(a);
    }

    static void typeConversionAndTypeCasting()
    {
        double f;    //64 slots
        int i=10;    //32 slots
        f=i;         //Type conversion
        System.out.println(f);

        double g=10;  //64
        int j;        //32
        j=(int)g;     //Type casting
        //32 bits= 64 bits
        System.out.println(i);
        System.out.println(j);
    }
}
