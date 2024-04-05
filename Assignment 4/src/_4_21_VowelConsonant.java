import java.util.Scanner;

public class _4_21_VowelConsonant {
    public static void main(String[] args) {
        Scanner mm =new Scanner(System.in);
        int i;
        System.out.println("Enter a string <<no spaces will be counted>>");
        String sent = mm.next();
        System.out.println("*******************************************************Result*****************************************");
        for ( i = 0; i < sent.length() ; i++) {
            if (sent.charAt(i)=='a'||sent.charAt(i)=='e'||sent.charAt(i)=='i'||sent.charAt(i)=='o'||sent.charAt(i)=='u'){
                System.out.print(" Vowel ");
            }else {
                System.out.print(" Consonant ");
            }
        }
    }
}
