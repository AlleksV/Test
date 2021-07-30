package main;

import java.util.Scanner;

public class TaskTwentyTwo {
    public static void main(String[] args) {
        int a, b, h, res = 0,x;
        Scanner enter = new Scanner(System.in);
        System.out.println("Input line segment (a;b):");
        a = enter.nextInt();
        b = enter.nextInt();
        System.out.println("input a step h:");
        h = enter.nextInt();
        x = a;
        for (int i = a; i < b; i += h) {
            if (x <= 2) {
                System.out.printf("y(x<=2)= %d \n",res = -x);
            } else System.out.printf("y(x>2)= %d \n",res = x);
            x+=h;

        }
    }
}
