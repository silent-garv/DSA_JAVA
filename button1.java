import java.util.*;
public class button1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int but = sc.nextInt();
        switch (but){
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Hola");
            break;    
            default : System.out.println("Invalid input");

        }
    }
}
