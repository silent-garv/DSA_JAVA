import java.util.*;
public class exe_07 {
    public static void main(String[] args) {
        int positiveCount  = 0;
        int negativeCount  = 0;
        int zeroCount      = 0;
        System.out.println("press 1 to continue and 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input == 1){
            System.out.println("Enter a number :");
            int num = sc.nextInt();
            if(num > 0 ){
                positiveCount++;
            }else if(num < 0 ){
                negativeCount++;
           }else{
            zeroCount++;           
           }System.out.println("press 1 to continue and 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("The number of positive no are:"+positiveCount);
        System.out.println("The number of negative no are:"+negativeCount);;
        System.out.println("The number of zeros are:"+zeroCount);
    }
}
