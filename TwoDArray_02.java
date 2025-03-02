import java.util.*;
public class TwoDArray_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows :");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns :");
        int col = sc.nextInt();

        int numbers[][] = new int [rows][col];
        System.out.println("Enter the elements of the array :");
        for(int i = 0 ; i< rows ; i++){
            for(int j = 0 ; j < col ; j++){
                numbers[i][j] = sc.nextInt();
            }
        } 
        System.out.print("Enter the value of x :");
        int x = sc.nextInt();
        for(int i = 0 ; i< rows ; i++){
            for (int j = 0 ; j < col ; j++){
                if(numbers[i][j] == x){
                    System.out.println("X found at index ("+ i +" , "+ j+")");
                }
sc.close();
            }
        }
    }
}