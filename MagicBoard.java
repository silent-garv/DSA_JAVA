import java.util.Scanner;

public class MagicBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[4];  // store 4 inputs

        System.out.println("Enter the digits:");
        for (int i = 0; i < 4; i++) {
            numbers[i] = sc.nextInt();
        }

        // Print number and corresponding ASCII character
        for (int num : numbers) {
            char ch = (char) num; // convert int to character
            System.out.println(num + "-" + ch);
        }
    }
}
