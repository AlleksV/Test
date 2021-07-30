package main;

import java.util.Scanner;

public class TaskThirteen {
    public static void main(String[] args){
        double x1,x2,x3,y1,y2,y3;
        double y, x;
        Scanner enter = new Scanner(System.in);
        System.out.println("Input coordinates of point A(x1;y1)");
        x1 = enter.nextInt();
        y1 = enter.nextInt();
        System.out.println("Input coordinates of point B(x2;y2)");
        x2 = enter.nextInt();
        y2 = enter.nextInt();
        System.out.println("Input coordinates of point C(x3;y3)");
        x3 = enter.nextInt();
        y3 = enter.nextInt();

        x = (x3-x1)/(x2-x1);
        y = (y3-y1)/(y2-y1);

        if(y==x){
            System.out.println("All three points are lying on one line");
        }
        else System.out.println("Try again...");


    }
}
