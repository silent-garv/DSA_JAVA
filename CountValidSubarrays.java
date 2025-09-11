import java.util.*;

public class CountValidSubarrays {
    public static int countSubarrays(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (arr[i] + arr[i + 2] == arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = countSubarrays(arr, n);
        System.out.println("Total valid subarrays of size 3: " + result);
        sc.close();
    }
}
