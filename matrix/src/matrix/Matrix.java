
package matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Matrix {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(new File("matrix.txt"));
// pre-read in the number of rows/columns
        int rows = 0;
        int columns = 1;
        while (input.hasNextLine()){
            columns = 1;
            ++rows;
            String riga = input.nextLine();
            for (int i = 0; i < riga.length(); i++){
                if (riga.charAt(i) == ' '){
                    ++columns;
                }
            }
        }
        System.out.println("matrix has " + rows + " rows and " + columns + " columns");
        int[][] a = new int[rows][columns];

        input = new Scanner(new File("matrix.txt"));

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j) {
                if (input.hasNextInt()) {
                    a[i][j] = input.nextInt();
                }
            }
        }
        
        for (int i = rows-1; i >=0; i--) {
            for (int j = columns-1; j >=0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}