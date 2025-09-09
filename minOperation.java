import java.util.*;

public class minOperation{
    public static int move(int N , int A[]){
        Arrays.sort(A);
        int Operations = 0;
        int expected = 1;

        for (int i = 0 ; i<N ; i++){
            if (A[i] < expected){
                Operations += (expected -A[i]);
                
            }
            expected ++;
        }
        return Operations;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of array : ");
         int N = sc.nextInt();
         System.out.print("Enter the elements of array : ");
         int A[] = new int [N];
         for (int i = 0 ; i<N ; i++){
            A[i] = sc.nextInt();
         }
         System.out.println(move(N , A));
    }
}