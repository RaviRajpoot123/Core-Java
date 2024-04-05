import java.util.Scanner;

public class _4_9_BattingAverage {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);

        double battingAverage, runsScoredCurrently, numberOfOuts;
        System.out.println("Enter the all runs");
        runsScoredCurrently = mm.nextInt();
        System.out.println("Enter the number of outs ");
        numberOfOuts = mm.nextInt();
        battingAverage = runsScoredCurrently / numberOfOuts;
        System.out.println("***********************************************************Average***********************************************************");
        System.out.println(battingAverage);
    }
}
