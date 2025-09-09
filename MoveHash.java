import java.util.*;
public class MoveHash{
    public static String Move(String str){
        int n = str.length();
        String s1 = "";
        String s2 = "";
        for(int i = 0 ; i< n ; i++){
            char ch = str.charAt(i);
            if(ch == '#'){
                s1= s1.concat("#");
            }else{
                s2 = s2.concat(String.valueOf(ch));
            }
        }
        return s1.concat(s2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");

        String str = sc.nextLine();
        System.out.println("Transformed string :" + Move(str));
        sc.close();

    }
}