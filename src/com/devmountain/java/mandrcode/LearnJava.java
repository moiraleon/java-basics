package com.devmountain.java.mandrcode;

public class LearnJava {

    public static void main(String[] args) {
        //using method from other class
         Animal animal = new Animal(); //creating new instance of other class
         String dog = animal.iAmDog(); // creating a sting variable to be referred to when invoking the funciton could also just be: System.out.println(animal.iAmDog());
         System.out.println(dog);


//primitive types
    int a =5;
    char b = 'i';
    long c = 400;
    double d = 3.2;

    addExclamationPoint("hot dogs");
    addExclamationPoint2("cat");

    //non-primitive types

        String name = "Susan"; //String type is actually an object
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());


    }

    public static void addExclamationPoint(String s){
        System.out.println(s + "!");

    }
    public static String addExclamationPoint2(String s){
        System.out.println(s + "!");
        return s + "!";

    }

}
