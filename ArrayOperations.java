import java.util.Arrays;

public class ArrayOperations {
    
    // Function to find the largest element in an array
    public static int findLargest(int[] arr) {
        if (arr.length == 0) return Integer.MIN_VALUE; // Return smallest possible value if empty
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Function to find the second largest element in an array
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) return Integer.MIN_VALUE; // Not enough elements
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second; // Return -1 if no second largest element exists
    }

    // Function to reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Main function to test array operations
    public static void main(String[] args) {
        int[] arr = {10, 45, 78, 23, 56, 45};

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Largest Element: " + findLargest(arr));
        System.out.println("Second Largest Element: " + secondLargest(arr));

        reverseArray(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

