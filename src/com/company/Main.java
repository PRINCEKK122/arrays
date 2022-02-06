package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
       // create a class called Array
        int[] numbers = {1, 2, 3, 3};
        Array array = new Array(3);
        array.insert(167);
        array.insert(20);
        array.insert(30);
        array.remove();
        array.insert(100);

        System.out.println("Largest Number: " + array.max());
//        array.removeAt(3);
        array.print();
        // an insert method
        // insertAt
        // a removeAt method
        // remove
        // an indexOf method
        // get
        // set
        // print

    }
}
