
import java.util.Scanner;

public class TwoDArray_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the numbers of rows :");
        int rows = sc.nextInt();
        System.out.print("Enter the numbers of columns :");
        int col = sc.nextInt();

        int numbers[][] = new int [rows][col];
        System.out.print("Enter elements of the array  :");
        for(int i = 0 ; i< rows ; i++){
            for( int j = 0 ; j< col ; j++){
                numbers[i][j] = sc.nextInt();   //input //
            }
        }
        for(int i = 0 ; i< rows ; i++){
            for(int j = 0 ; j< col ; j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
            sc.close();
        } 
     
    }
}
