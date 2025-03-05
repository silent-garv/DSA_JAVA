import java.util.*;
public class rev_str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse:");
        String name = sc.next();
    StringBuilder sb = new StringBuilder(name);
    
    for(int i = 0 ; i<sb.length()/2 ; i++){

        int front  = i ;
        int back   = sb.length() - 1 - i ;

        char frontChar = sb.charAt(front);  //setting front and back values 
        char backChar  = sb.charAt(back) ;

        sb.setCharAt(front , backChar);   //( index , value to be replaced with )
        sb.setCharAt(back , frontChar);

    }
    System.out.println("Reversed string :"+sb);
    sc.close();
    }
}
