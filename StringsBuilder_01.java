

public class StringsBuilder_01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Garv");
        System.out.println(sb);

        //char at index 0 
        System.out.println(sb.charAt(0));

        //setting char at index 0 
        sb.setCharAt(0,'A');
        System.out.println(sb);

        //inserting string 
        sb.insert(0,'G');
        System.out.println(sb);

        //delete the char 
        sb.delete(1,2);//end index is non exclusive 
        System.out.println(sb);
    }
}
