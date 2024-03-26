import java.util.Scanner;
class SOD{

public static void main(String [] dvjc){
Scanner mm = new Scanner(System.in);
int num = 321;
int sum = 0;
while(num>=0){
sum = sum + num;
num = num % 10;
}
System.out.println(sum);

}
}