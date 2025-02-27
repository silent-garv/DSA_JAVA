import java.util.Scanner;

public class Exe10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci terms: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int a = 0, b = 1;
            System.out.print("Fibonacci Series: " + a); 

            if (n > 1) {
                System.out.print(" " + b); // Print second term only if n > 1
                for (int i = 3; i <= n; i++) { // Start from the 3rd term
                    int temp = b;
                    b = a + b;
                    a = temp;
                    System.out.print(" " + b);
                }
            }
            System.out.println(); // Move to a new line after printing the series
        }

        sc.close(); // Close scanner to prevent memory leak
    }
}
