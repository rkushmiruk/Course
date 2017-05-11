package com.romankushmiruk.matrix;

/**
 * Created by roman on 13.04.17.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Matrix m1 = MatrixFactory.createMatrix(3, 4);
            Matrix m2 = MatrixFactory.createMatrix(3, 4);
            System.out.println(m1);
            System.out.println(m2);
            Matrix m3 = Summator.sumMatrix(m1, m2);
            System.out.println(m3);
            Matrix m4 = Multiplicator.multiply(m1, m2);
            System.out.println(m4);
        } catch (NullPointerException e) {
            System.out.println("matrix does'nt exist: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong coordinates: " + e);
        }

    }
}
