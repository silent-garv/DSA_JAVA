import java.util.*;
public class hw_Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = sc.nextInt();
        String nameArr[] = new String[size];

        System.out.println("Enter the names of student:");;
        for(int i = 0 ; i< size ; i++){
            nameArr[i] = sc.next();
        }
        for(int i = 0 ; i<size ; i++){
            System.out.println(nameArr[i]);
        }

    }
}
