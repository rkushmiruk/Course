/**
 * Created by roman on 13.04.17.
 */
public class MatrixFactory {

    public static Matrix createMatrix(int row, int col) {
        Matrix matrix = new Matrix(row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix.setElement(i, j, (int) (Math.random() * row * col));
            }
        }
        return matrix;
    }
}
