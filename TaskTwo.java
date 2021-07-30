package main;

import java.util.Scanner;

public class TaskTwo {
    public static void main (String[] args){
        double a = 0;
        double b = 0;
        double c = 0;
        double answer = 0;
        Scanner inputnumb  = new Scanner(System.in);
        System.out.println("Input value a:");
        a = inputnumb.nextDouble();
        System.out.println("Input value b:");
        b = inputnumb.nextDouble();
        System.out.println("Input value c:");
        c = inputnumb.nextDouble();
        answer = (b + Math.sqrt((Math.pow(b, 2))+ 4 * a * c)) / 2 * a - Math.pow(a,3) * c + Math.pow(b, -2);
        System.out.println("Function value is " + answer);
        System.out.printf("Function value is %.2f", answer);
    }
}
