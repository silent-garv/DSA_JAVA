import java.util.*;
public class Check_and_reverse{
    public static void reverse(int arr[]){
        int left = 0 ,right = arr.length - 1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp ;
            left++;
            right--;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int mid = n/2;
        int sumFirst = 0 , sumSecond = 0 ;

        for(int i = 0 ; i<mid ; i++){
            sumFirst = sumFirst + arr[i];

        }
        for(int i = mid ; i<n ; i++){
            sumSecond += arr[i];
        }
        if(sumFirst<sumSecond){
            reverse(arr);
            System.out.print("reversed arr:");
        for(int num : arr){
            System.out.print(num +" ");
        }
        }else{
            System.out.println("First half is greater than second half");
        }
        

    }
    
}
