import java.util.Arrays;
class Main {
    static int countLines(int[][] array){
        int numOfLines = 0;
        for (int i = 0; i < array.length; i++){
            numOfLines++;
        }
        return numOfLines;

    }
    static int countRows(int[][] array){
        int x, i;
        int numOfRows = 0;
        for (i = 0; i < array.length; i++){
            for (x = 0; x < array[i].length; x++){
            //System.out.println(x);
            }
            if (x > numOfRows){
                numOfRows = x;
            }
        }

        return numOfRows;
    }

    public static void main(String[] args) {
        int [][] table = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(table));
        System.out.println(countLines(table)+ "x"+countRows(table));
        //System.out.println(countRows(table));
    }
}