package main;

import java.math.BigInteger;

public class TaskTwentyFourVer2 {
    public static void main(String[] args){
        BigInteger prod = BigInteger.valueOf(1);
            for(int i=1; i<=200; i++){
            prod = prod.multiply(BigInteger.valueOf((long) i * i));
            }

        System.out.print("The product of squares of the first two hundred numbers = " + prod);



    }
}
