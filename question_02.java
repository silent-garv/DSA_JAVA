// print the table of a number input by the user //
import java.util.*;
class question_02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1; i<=10 ; i++){
            System.out.println(num*i);
        }

    }
}
