package main;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args){
        int A,B;
        Scanner angles = new Scanner(System.in);
        System.out.println("Input angles A and B of a triangle in degrees:");
        A = angles.nextInt();
        B = angles.nextInt();
        int sum = A + B;
        if(sum<180 && A>0 && B > 0){
            System.out.println("Triangle is exist");
            if(A==90 || B==90 || sum==90){
                System.out.println("Triangle is rectangular");
            }
        }
        else System.out.println("Triangle does not exist");

    }
}
