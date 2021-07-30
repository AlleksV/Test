package main;

import java.util.Scanner;

public class TaskFive {
    public static void main (String[] args) {
        double coef = 60.0;
        double inputsec = 0.0;
        int sec = 0;
        int minut = 0;
        int hour = 0;
        double sectmp = 0.0;
        double minuttmp;
        double hourtmp = 0.0;
        Scanner entersec = new Scanner(System.in);
        System.out.println("Enter your seconds:");
        inputsec = entersec.nextInt();
        hourtmp=inputsec/3600.0;
        hour=(int)hourtmp;

        minuttmp=(hourtmp - hour)*60;
        minut=(int)minuttmp;

        sectmp=(inputsec - hour*3600 - minut*60);
        sec=(int) sectmp;

        System.out.printf("%02d:%02d:%02d", hour, minut, sec);


    }
}
