package chapter1;

import java.util.Scanner;

public class C1E5 {



    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        double number;
        number = in.nextDouble();

        System.out.println("default value is printed when large double number is converted to int " + (int)number);
    }
}
