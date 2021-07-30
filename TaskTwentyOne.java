package main;

import java.util.Scanner;

public class TaskTwentyOne {
    public static void main(String[] args){
        int x, suma = 0;
        Scanner enter = new Scanner(System.in);
        System.out.println("Input any positive integer:");
        x = enter.nextInt();
        for (int i=1; i<=x; i++){
            suma+=i;

        }

        System.out.println("The sum of numbers = " + suma);


    }
}
