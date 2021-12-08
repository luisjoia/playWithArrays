import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    static int countRows(int[][] array){
        int numOfRows = 0;
        for (int i = 0; i < array.length; i++){
            numOfRows++;
        }
        return numOfRows;

    }
    static int countColums(int[][] array){
        int x, i;
        int numOfColums = 0;
        for (i = 0; i < array.length; i++){
            for (x = 0; x < array[i].length; x++){
            //System.out.println(x);
            }
            if (x > numOfColums){
                numOfColums = x;
            }
        }

        return numOfColums;
    }
    static int averageRowValue(int[][] array, int row){
        int i;
        int sum = 0;
        int average = 0;
        for (i = 0; i < array[row].length; i++){
            sum = array[row][i] + sum;
        }
        return average = sum / (i);
    }
    static int averageColumValue(int[][] array, int colum){
        int i;
        int sum = 0;
        int average = 0;
        for (i = 0; i < array.length; i++){
            sum = array[i][colum] + sum;
        }
        return average = sum / (i);
    }
    static List diagonalValues(int[][] array){
        int i;
        int x = 0;
        List dValues = new ArrayList();
            for (i = 0; i < array.length; i++){
                dValues.add(array[i][i]);
            }
        return dValues;
    }


    public static void main(String[] args) {
        int [][] table = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(table));
        System.out.println(countRows(table)+ "x"+countColums(table));
        System.out.println(averageRowValue(table, 0));
        System.out.println(averageColumValue(table, 0));
        System.out.println(diagonalValues(table));
    }
}