import java.util.Scanner;
class SCal{
public static void main(String [] klhjh){
Scanner mm = new Scanner(System.in);
System.out.println("Choose a number to perform a operation: ");
System.out.println("1. To Add");
System.out.println("2. To Substraction");
System.out.println("3. To Multiplication");
System.out.println("4. To Division");
System.out.println("5. To Modulus");
int num = mm.nextInt();
System.out.println("Enter any Two numbers : ");
switch(num){
case 1:{
double num1 = mm.nextDouble();
double num2 = mm.nextDouble();
double total = num1 + num2;
System.out.println(num1 +" Adds  " + num2 +" : " +  total);
break;
}case 2:{
double num1 = mm.nextDouble();
double num2 = mm.nextDouble();
double total = num1 - num2;
System.out.println(num1 +" Subtraction  " + num2 +" : " +  total);
break;
}case 3:{
double num1 = mm.nextDouble();
double num2 = mm.nextDouble();
double total = num1 * num2;
System.out.println(num1 +" Multiplication  " + num2 +" : " +  total);
break;
}case 4:{
double num1 = mm.nextDouble();
double num2 = mm.nextDouble();
double total = num1 / num2;
System.out.println(num1 +" Division  " + num2 +" : " +  total);
break;
}case 5:{
double num1 = mm.nextDouble();
double num2 = mm.nextDouble();
double total = num1 % num2;
System.out.println(num1 +" Modulus  " + num2 +" : " +  total);
break;
}
default:{
System.out.println("Incorrect");
}
}
}
}