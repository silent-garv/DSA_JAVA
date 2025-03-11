import java.util.*;
public class Exe_01_CWH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of your subjects:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int result = a + b + c + d + e;
        System.out.println("The sum of your marks is :"+result);
        double percentage = (result/500.0)*100;
        System.out.println("The percentage of your marks is :"+percentage);
        sc.close();
    }
}
