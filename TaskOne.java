package main;

import java.util.Scanner;

public class TaskOne {
    public static void main (String[] args){
        int a=5;
        int b=2;
        int c=0;
        double z = 0;
        System.out.println("Exponentiation of Number a1 to a2 is equal " + Math.pow(a,b));
        System.out.printf("Exponentiation of Number %d to %d is equal %.1f \n", a, b, Math.pow(a,b));

        Scanner sc= new Scanner(System.in);
        System.out.println("Input a");
        a = sc.nextInt();
        System.out.println("Input b");
        b = sc.nextInt();
        System.out.println("Input c");
        c = sc.nextInt();
        z = ((a-3)*b/2)+c;

        System.out.println("Function result is "+z);

    }
}
