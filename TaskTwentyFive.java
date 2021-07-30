package main;

import java.util.Scanner;

public class TaskTwentyFive {
    public static void main(String[] args){
        double e,sum=0.0;
        int n=100;
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        e = enter.nextDouble();
        for (int i=1; i<n; i++){
            double ai = (1/(Math.pow(2,i)))+(1/(Math.pow(3,i)));
            if (Math.abs(ai)>=e){
                sum+=ai;
            }
        }
        System.out.println("Sum of members of the series: " + sum);



    }
}
