

public class Stringmethoda {
    public static void main(String[] args) {
        String name = "Garv";
        int vlue = name.length();
        System.out.println(name);
        System.out.println(vlue);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String nonTrimedString = "                       Garv                          ";
        System.out.println(nonTrimedString);
        System.out.println(nonTrimedString.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,3));
        System.out.println(name.replace('G','C'));
        System.out.println(name.startsWith("Ga"));
        System.out.println(name.endsWith("rv"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("r"));




    }
}
