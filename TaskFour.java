package main;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args){
        double innumb = 0.0;
        int tmp = 0;
        double result = 0.0;
        Scanner inputnumb = new Scanner(System.in);
        System.out.println("Enter a number like nnn.ddd: ");
        innumb = inputnumb.nextDouble();
        tmp = (int) innumb;
        result = tmp / 1000.0 + (innumb-tmp)*1000;
        System.out.println("Your changed number: " + result);
        System.out.printf("Your changed number: %6.3f \n", result);

        double x = 123.456;
        double f = (x * 1000) % 1000;
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }
}
