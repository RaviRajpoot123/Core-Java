import java.util.Scanner;
public class Primenum {
    public static void main(String[] args) {
        int n , count = 0, i;
        Scanner mm = new Scanner(System.in);
        System.out.println();
        n = mm.nextInt();
        for(i = 1;i<= 5; i++)
        {
            if(n%i == 0){
                count++;
            }

        } if(count == 2){
            System.out.println("Num Is prime :" + n);
        }else {
            System.out.println("its not prime;");
        }
    }
}
