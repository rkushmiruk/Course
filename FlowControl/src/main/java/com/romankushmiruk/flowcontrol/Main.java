package com.romankushmiruk.flowcontrol;

/**
 * Created by roman on 20.04.17.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Numbers of occurrences: " + Test.occurrences(77877, 77));//task 1

        Test.analyseOfArray(3, 23, 23, 112, 3, 12, 1, 312, 3, 12, 3, 131, 123, 1);//task 2

        System.out.println("Count of years: " + Test.countYears(100, 10, 200));//task 3
//
        Test.drawLeftLowerTriangleMatrix(5);//task 4A
//
        Test.drawRightLowerTriangleMatrix(5);//task 5B

    }
}
