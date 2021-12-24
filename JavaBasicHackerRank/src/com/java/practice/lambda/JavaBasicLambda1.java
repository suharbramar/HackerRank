package com.java.practice.lambda;

interface MyFunction{
    String printText(String text1, String text2);

}



public class JavaBasicLambda1 {
    public static void main(String args[]){
       MyFunction myFunction = (text1, text2) -> {
           return text1 + text2 + " Test lambda";
       };
       System.out.println(myFunction.printText("Hello Word", "lambda"));

    }
}
