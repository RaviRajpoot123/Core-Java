import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Scanner Enter = new Scanner(System.in);
        Random random = new Random();
       // int min = 9;
       // int max = 10; Method one to generates random number
       // int randomNumber = random.nextInt(max - min + 1) + min;
        // method two to generates random variable
        int count =0;
        while (true) {
            System.out.println("""
                    Choose any number to play
                    1. Yes
                    2. No
                    """);
            int n = Enter.nextInt();

            if (n == 1 || n == 2) {

                if (n == 1) {
                    System.out.println("""
                            hello, Welcome to the stone paper scissors game
                            1. Scissor
                            2. Stone
                            3. Paper""");
                    int m = random.nextInt(1,4); // method two does not includes boudary
                    n = Enter.nextInt();

                    if (n == m) {
                        System.out.println("It's a tie! Let's break it by trying Again !");
                    } else if ((n == 1 && m == 3) || (n == 2 && m == 1) || (n == 3 && m == 2)) {
                        count += 1;
                        System.out.println("Bingo! You have made it " + count);

                    } else if (n == 1 && m == 2) {
                        System.out.println("Stone has breaked your Scissor! and you have lost it!");
                    } else if (n == 2 && m == 3) {
                        System.out.println(" Paper have captured your stone!, and you have lost it!");
                    } else if (n == 3 && m == 1) {
                        System.out.println("Your Paper got cutted by Scissor! and you have lost it!");
                    } else {
                        System.out.println("Wrong key retry again! ");

                    }


                } else {
                    System.out.println("Sad to see you go:( ,Have a good day!");
                    break;
                }
            }
            else {
                System.out.println("You have chosen the wrong key");
            }
        }

    }

}