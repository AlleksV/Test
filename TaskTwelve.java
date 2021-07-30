package main;

import java.util.Scanner;

public class TaskTwelve {
    public static void main (String [] args){
        int a,b,c,d, min1,min2;
        Scanner enter = new Scanner(System.in);
        a = enter.nextInt();
        b = enter.nextInt();
        c = enter.nextInt();
        d = enter.nextInt();

        if(a<b){
            System.out.println(min1=a);
        }
        else System.out.println(min1=b);

        if(c<d){
            System.out.println(min2=c);
        }
        else System.out.println(min2=d);

        if(min1<min2){
            System.out.println("Largest number from smallest (c and d) is " + min2);
        }
        else System.out.println("Largest number from smallest (a and b) " + min1);



    }
}
