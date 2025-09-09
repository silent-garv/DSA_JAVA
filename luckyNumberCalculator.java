import java.util.*;
public class luckyNumberCalculator {
    public static int calculator(int N , String word ){
        int sum = 0 ;

        for (int i = 0 ; i< N ; i++){
            int index = i+1;
            int ascii = (int) word.charAt(i);
            int product = index * ascii ;

            if(ascii %2 == 1  || index  % 2 == 1){
                sum += product;
            }
        }return sum;
   }
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int N = 5;
    String word = "jacky";
    System.out.println("The lucky number is : " + calculator(N,word));
    }
    
}
