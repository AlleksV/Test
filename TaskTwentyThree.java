package main;

public class TaskTwentyThree {
    public static void main(String[] args){
        int sum=0, sq=0;
        for(int i=1; i<=100; i++){
            sq=i*i;
            sum+=sq;
        }

        System.out.println("The sum of squares of the first hundred numbers = " + sum);



    }
}
