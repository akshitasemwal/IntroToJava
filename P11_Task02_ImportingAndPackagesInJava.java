package Unit_02; // Inside this package we can create many classes !

import static java.lang.System.*;
import static java.lang.Math.*;

import Unit_01.SampleClass1;

public class P11_Task02_ImportingAndPackagesInJava {
    public static void main(String[] args) {

        out.println("Welcome to package");

        out.println(sqrt(4));
        System.out.println(pow(2,2));
        System.out.println(abs(6.4));

        SampleClass1 obj = new SampleClass1();
        System.out.println(obj.a);
    }
}