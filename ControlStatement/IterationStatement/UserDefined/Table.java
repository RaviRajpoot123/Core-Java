import java.util.Scanner;
class Table{
public static void main(String [] fbj)
{
Scanner mm = new Scanner( System.in);
System.out.println("Enter any number to get a table: ");
int num = mm.nextInt();
for( int i = 1; i<=10 ; i++){
System.out.println(num + " X " + i +" = "+(num*i));
}
}
}