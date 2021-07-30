package main;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args){
        double x = 0;
        double y = 0;
        double solution = 0;
        Scanner inputnumb = new Scanner(System.in);
        System.out.println("Input x: ");
        x = inputnumb.nextDouble();
        System.out.println("Input y: ");
        y = inputnumb.nextDouble();
        solution = (Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.println("Solution of the equation: " + solution);
        System.out.printf("Solution of the equation: %.3f", solution);
    }
}
