package main;

import java.util.Scanner;

public class TaskFourteen {
    public static void main (String[] args){
        int A,B,x,y,z;
        Scanner enter = new Scanner(System.in);
        System.out.println("Please, input hole size (A and B):");
        A = enter.nextInt();
        B = enter.nextInt();
        System.out.println("Now input brick size (x,y,z):");
        x = enter.nextInt();
        y = enter.nextInt();
        z = enter.nextInt();
        int P=A+B;
        int p1=x+y;
        int p2=x+z;
        int p3=y+z;
        if (P>=p1 || P>=p2 || P>=p3){
            System.out.println("Congratulation! The brick crawls through the hole!");
        }
        else System.out.println("...try again!");





    }
}
