import java.util.*;
public class exe_03 {
public static int maxNumber(int a , int b){
     if(a>b){
        return a;
     }else{
        return b;
     }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("The maximum number is :"+maxNumber(a,b));
}
}
