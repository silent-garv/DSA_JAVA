import java.util.*;
public class hw_Array_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the elements of Array :");
        for( int i = 0 ; i< size ; i++){
            numbers[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<size ; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }

            if(numbers[i] > max){
                max = numbers[i];
            }
        }

        System.out.println("Minimum value is :"+min);
        System.out.println("Maximum value is :"+max);
    }
}
