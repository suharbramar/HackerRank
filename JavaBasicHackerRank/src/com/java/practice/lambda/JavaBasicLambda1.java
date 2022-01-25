package com.java.practice.lambda;

//functional interface only can have single abstract method
interface MyFunctionalInterface{
    default void printHelloWorld(){
        System.out.println("Hello World");
    }
    static int getNumber(){
        return  1;
    }

    String printText(String text1, String text2);

}


public class JavaBasicLambda1 {

    // pass functionality as method argument to functional interface
    public static MyFunctionalInterface doPrint(){
       return (text1, text2) -> "Basic lambda "+text1 +" "+text2;
    }


    public static void main(String args[]){
        MyFunctionalInterface myFunctionalInterface = doPrint();
        myFunctionalInterface.printText("Exp1", "Exp2");

//       MyFunctionalInterface myFunctionalInterface = ((text1, text2) -> {
//          // System.out.println(text1+" "+text2);
//           return "Basic lambda "+text1 +","+text2;
//       });
//
       System.out.println(myFunctionalInterface.printText("expression1", "expression2"));
    }
}
