package com.romankushmiruk.Matrix;

/**
 * Created by roman on 13.04.17.
 */
public class Summator {

    public static Matrix sumMatrix(Matrix m1, Matrix m2) {
        if ((m1.getHorizontalSize() != m2.getHorizontalSize())
                || (m1.getVerticalSize() != m2.getVerticalSize())) {
            return null;
        }

        Matrix resultMatrix = MatrixFactory.createMatrix(m1.getVerticalSize(), m1.getHorizontalSize());
        for (int i = 0; i < m1.getVerticalSize(); i++) {
            for (int j = 0; j < m1.getHorizontalSize(); j++) {
                resultMatrix.setElement(i, j, (m1.getElement(i, j) + m2.getElement(i, j)));
            }
        }
        return resultMatrix;
    }
}
