package main;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args){
        int x,y;
        Scanner enternumb = new Scanner(System.in);
        System.out.println("Input coordinates (x;y):");
        x = enternumb.nextInt();
        y = enternumb.nextInt();
        if (-4<=x && x<=4 && -3 <= y && y <= 4) {
            System.out.println("true");
        }
        else
            System.out.println("false");


    }
}
