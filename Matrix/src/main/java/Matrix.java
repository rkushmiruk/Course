/**
 * Created by roman on 13.04.17.
 */
public class Matrix {

    private int[][] arr;

    public Matrix(int row, int col) {
        arr = new int[row][col];
    }

    public int getElement(int rowPosition, int colPosition) {
        if ((rowPosition >= arr.length) || (colPosition >= arr[0].length)) {
            return -1;
        }
        return arr[rowPosition][colPosition];
    }

    public void setElement(int rowPosition, int colPosition, int value) {
        if ((rowPosition >= arr.length) || (colPosition >= arr[0].length)) {
            return;
        }
        arr[rowPosition][colPosition] = value;
    }

    public int getHorizontalSize() {
        return arr[0].length;
    }

    public int getVerticalSize() {
        return arr.length;
    }

    @Override
    public String toString() {
        String result = "";
        for (int[] colArray : arr) {
            result += "{";
            for (int sell : colArray) {
                result += sell + " ";
            }
            result += "}\n";
            result = result.replace(" }", "}");
        }
        return result;
    }
}
