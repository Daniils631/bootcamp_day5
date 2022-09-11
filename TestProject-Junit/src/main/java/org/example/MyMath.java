package org.example;

public class MyMath {
    public static double divide(int numbee1, int number2){
       if (number2 == 0)
           throw new ArithmeticException("Can't divide by Zero ");

        return numbee1/number2;
    }

}
