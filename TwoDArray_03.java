// to find the spiral order of a matrix //
import java.util.*;
public class TwoDArray_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of rows :");
        int rows = sc.nextInt();
        System.out.print("Enter the numbers of columns :");
        int col = sc.nextInt();

        int numbers[][] = new int [rows][col];
        System.out.print("Enter elements of the array  :");
        for(int i = 0 ; i<rows ; i++){
            for( int j = 0 ; j<col ; j++){
                numbers[i][j] = sc.nextInt();   //input //
            }
        }
        System.out.println("The spiral order matrix is :");
        int rowsStart = 0;
        int rowsEnd  = rows-1;
        int colStart = 0 ;
        int colEnd   = col-1;

        while(rowsStart <= rowsEnd && colStart <= colEnd){
            for(int i = colStart ; i<=colEnd ; i++){
                System.out.print(numbers[rowsStart][i]+" ");
            }
            rowsStart ++ ;

            for(int j = rowsStart ; j<= rowsEnd ; j++){
                System.out.print(numbers[j][colEnd]+" ");
            }
            colEnd -- ;

            for(int i = colEnd ; i>= colStart ; i--){
                System.out.print(numbers[rowsEnd][i]+" ");
            }
            rowsEnd -- ;
            for(int j = rowsEnd ;j>= rowsStart ; j++){
                System.out.print(numbers[j][colStart]+" ");
            }
            colStart ++ ;
            System.out.println();
            sc.close();
        }
    }
}
