import java.util.*;;
public class exe_12 {
    public static int isPrime(int n){
        int flag = 0;
        for(int i = 2 ; i<=n/2 ; i++){
            if(n%i == 0){
                flag = 1;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n) == 0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
