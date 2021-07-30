package main;

public class TaskTwentyFour {
    public static void main(String[] args){
        double prod=1.0, sq=0.0;
        for(int i=1; i<=200; i++){
            sq=Math.pow(i,2);
            prod=prod * sq;
        }

        System.out.println("The product of squares of the first two hundred numbers = " + prod);



    }


}
