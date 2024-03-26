import java.util.Scanner;
class SOD{
    public static void main(String [] xyz){
        int n ,sum = 0 ,rem;
        Scanner  mm= new Scanner(System.in);
        System.out.println("Enter to know Sum Of Digit : ");
        n = mm.nextInt();
        for( ; n> 0; n= n/10){
            rem = n%10;
            sum = sum * rem;

        }
        System.out.println("The SOD of Entered number is : " + sum);
    }

}