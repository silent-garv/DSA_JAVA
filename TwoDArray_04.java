import java.util.*;
public class TwoDArray_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the numbers of columns:");
        int col = sc.nextInt();
        int numbers [][] = new int [rows][col];

        System.out.println("Enter the elements of the array :");
        for( int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j< col ; j++){
                numbers[i][j] = sc.nextInt();   
            }
        }
        System.out.println("The transpose matris is :");
        for(int j = 0 ; j< col ; j++){
            for(int i = 0 ; i < rows ; i++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
            sc.close();
            
        }

    }
}
