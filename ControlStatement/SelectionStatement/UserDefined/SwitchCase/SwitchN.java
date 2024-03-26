import java.util.Scanner;
class SwitchN{
public static void main(String [] klhjh){
Scanner mm = new Scanner(System.in);
System.out.print("Enter any number from 1-3 : ");
int num = mm.nextInt();
switch(num){
case 1:{
System.out.println("First");
break;
}case 2:{
System.out.println("Second");
break;
}case 3:{
System.out.println("Third");
break;
}
default:{
System.out.println("Incorrect");
}
}
}
}