package main;

import java.util.Scanner;

public class TaskTwentySeven {
    public static void main(String[] args){
        int result = 0;
        Scanner enter = new Scanner(System.in);
        System.out.println("enter integer limits (m,n)");
        int m = enter.nextInt();
        int n = enter.nextInt();
        for (int i = m; i <= n;i++){
            for (int j = 2;j < n; j++){
                result = i / j;
                if (i % j == 0 && result != 1) {
                    System.out.println("divisor for " + i + " is " + j);
                }
            }
        }
    }
}
