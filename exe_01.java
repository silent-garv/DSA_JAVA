import java.util.*;
public class exe_01 {
    public static int calculateAverage(int a , int b , int  c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(calculateAverage(a,b,c));
    }
}
