import java. util.*;
public class Strings_hw_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        String array[] = new String[size];

        int totLength = 0;
        for(int i = 0 ; i< size ; i++){
            array[i] = sc.next();//input
            totLength =totLength + array[i].length();// str length = total length 
        }
        System.err.println(totLength);
        sc.close();
    }
}
