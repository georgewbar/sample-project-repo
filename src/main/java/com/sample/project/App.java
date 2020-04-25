package com.sample.project;

/**
 * This class has main method and returns "Hello World"
 * and some easter eggs questions and answers.
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(getHelloString() + " " + getWorldString());
    }

    public static String getHelloString(){
        return "Hello";
    }

    public static String getWorldString(){
        return "World";
    }

}
