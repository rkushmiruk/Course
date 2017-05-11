package com.romankushmiruk.matrix;

/**
 * Created by roman on 14.04.17.
 */
public class Multiplicator {

    public static Matrix multiply(Matrix m1, Matrix m2) {
        int v = m1.getVerticalSize();
        int h = m2.getHorizontalSize();
        int temp = m1.getHorizontalSize();
        Matrix result = MatrixFactory.createMatrix(m2.getHorizontalSize(), m1.getVerticalSize());

        if (temp != m2.getVerticalSize()) {
            return null;
        }

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                int value = 0;
                for (int k = 0; k < temp; k++) {
                    value += m1.getElement(i, k) * m2.getElement(k, j);
                }
                result.setElement(i, j, value);
            }
        }
        return result;
    }
}
