package main;

import java.util.Scanner;

public class TaskFiveteen {
    public static void main(String[] args){
        double x, result;
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a number for x:");
        x = enter.nextDouble();
        if (x<=3) {
            result = Math.pow(x,2)-3*x+9;
        }
        else result = 1/(Math.pow(x,3)+6);
        System.out.print("Function value F(x)=" + result);

    }
}
