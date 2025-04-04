public class exe_2_1 {
    public static void main(String[] args) {
        char Grade = 'C';

        //Encrypting the grade
        Grade = (char) (Grade + 8 );
        System.out.println(Grade);

        //Decrypting the grade
        Grade = (char) (Grade -  8 );
        System.out.println(Grade);

    }
}
