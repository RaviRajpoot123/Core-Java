public class _4_16_StringReverse {
    public static void main(String[] args) {
        String sent = "Hello World";
        System.out.println("************************************************************************StringReversed************************************************************************");
        for (int i = sent.length()-1; i >=0 ; i--) {
            System.out.print(sent.charAt(i));
        }
    }
}
