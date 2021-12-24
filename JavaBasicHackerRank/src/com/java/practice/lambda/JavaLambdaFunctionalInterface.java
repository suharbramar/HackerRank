package com.java.practice.lambda;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
/*
Java lambda expression can only implement single method interfaces, meaning interfaces with a single method in.
However, that is not entirely correct.

A Java lambda expression can implement interfaces which have a single unimplemented method (abstract method),
but the interface can have as many default and static methods as you like. This video shows examples of that.
 */
interface MyInterface{
    void printIt(String text);

    default public void printUtf8To(String text, OutputStream outputStream){
        try{
            outputStream.write(text.getBytes(StandardCharsets.UTF_8));

        }catch(IOException e){
            throw new RuntimeException("Error writing String as UTF-8 TO outputstream");
        }
    }

    static void printItToSystemOut(String text){
        System.out.println(text);
    }

}
public class JavaLambdaFunctionalInterface {
        public static void main(String args[]) throws FileNotFoundException {
            //pass functionality as an argument to another method
            MyInterface myInterface = (String text) -> System.out.println(text);

            myInterface.printIt("Hello World");
            myInterface.printUtf8To("Hello World", new FileOutputStream("data.txt"));

            MyInterface.printItToSystemOut("Hello Out");
        }
}
