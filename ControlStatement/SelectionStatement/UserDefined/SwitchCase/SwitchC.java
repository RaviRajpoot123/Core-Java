import java.util.Scanner;
class SwitchC{
public static void main(String [] klhjh){
Scanner mm = new Scanner(System.in);
System.out.print("Enter any Alphabet from a-c : ");
char num = mm.next().charAt(0);
switch(num){
case 'a':
System.out.println("First");
break;
case 'b':
System.out.println("Second");
break;
case 'c':
System.out.println("Third");
break;

default:{
System.out.println("Incorrect");
}
}
}
}