import java.util.*;
public class Array_03 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int indexArr[] = new int[size];
        System.out.println("Enter the elements of Array :");
        for(int i = 0 ; i< size ; i++){
            indexArr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of x :");
        int x = sc.nextInt();

        for( int i= 0 ; i< size ; i++){
            if(indexArr[i] == x){
                System.out.println("X FOUND AT INDX :"+i);
            }
        }

    }
}
