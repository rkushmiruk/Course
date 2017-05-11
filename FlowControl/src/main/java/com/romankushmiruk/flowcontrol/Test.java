package com.romankushmiruk.flowcontrol;

/**
 * Created by roman on 19.04.17.
 */
public class Test {

    public static int occurrences(int baseNumber, int checkNumber) {
        final int lengthBaseNumber = numberLength(baseNumber);
        final int lengthCheckNumber = numberLength(checkNumber);
        int numberOfOccurrences = 0;
        int[] arrayOfNumbers = new int[lengthBaseNumber - lengthCheckNumber + 1];
        final int divider = (int) Math.pow((double) 10, (double) (lengthCheckNumber));

        if (lengthBaseNumber < lengthCheckNumber) {
            return 0;
        }

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = baseNumber % divider;
            baseNumber /= 10;
            if (arrayOfNumbers[i] == checkNumber) {
                numberOfOccurrences++;
            }
        }

        return numberOfOccurrences;
    }

    public static void analyseOfArray(int... arrayOfNumbers) {
        int min = 0;
        int max = 0;
        double sum = 0;
        double averageOfNumbers = 0;

        if (arrayOfNumbers.length > 0) {
            min = arrayOfNumbers[0];

            for (int i = 0; i < arrayOfNumbers.length; i++) {
                if (arrayOfNumbers[i] < min) {
                    min = arrayOfNumbers[i];
                }
                if (arrayOfNumbers[i] > max) {
                    max = arrayOfNumbers[i];
                }
                sum += arrayOfNumbers[i];
            }

            averageOfNumbers = sum / arrayOfNumbers.length;
        }

        System.out.println("Amount of numbers: " + arrayOfNumbers.length);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + averageOfNumbers);
    }

    public static int countYears(double startCapital, double persent, double finishCapital) {
        int years = 0;

        if (startCapital >= finishCapital) {
            return 0;
        }

        /**
         * Loop while;
         */
        while (startCapital <= finishCapital) {
            years++;
            startCapital += startCapital * (persent / 100);
        }

        /**
         * Loop while with break and label;
         */
//        while(true){
//            years++;
//            startCapital +=startCapital*(persent/100);
//            if(startCapital>=finishCapital){
//                return years;
//            }
//        }
        /**
         * Loop while with break;
         */
//       while(true){
//            years++;
//            startCapital +=startCapital*(persent/100);
//            if(startCapital>=finishCapital){
//                break;
//            }
//        }
        /**
         * Loop while with break and label;
         */
//       OUTER: while(true){
//            years++;
//            startCapital +=startCapital*(persent/100);
//            if(startCapital>=finishCapital){
//                break OUTER;
//            }
//        }
        /**
         * Loop do-while; We can use it cause we have condition that
         * startCapital cant be more than finishCapital;
         */
//        do{
//           years++;
//           startCapital+=startCapital*(persent/100);
//        }while (startCapital<=finishCapital);
        /**
         * Loop for with break;
         */
//        for (; ; ) {
//            years++;
//            startCapital += startCapital * (persent / 100);
//            if (startCapital >= finishCapital) {
//                break;
//            }
//        }
        return years;
    }

    public static void drawLeftLowerTriangleMatrix(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
                System.out.print(i - j + " ");
            }
        }
    }

    public static void drawRightLowerTriangleMatrix(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 0; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((i - j));
            }
            System.out.println();
        }

    }

    private static int numberLength(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}
