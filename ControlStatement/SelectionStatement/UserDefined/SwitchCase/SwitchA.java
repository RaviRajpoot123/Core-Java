import java.util.Scanner;
class SwitchA{
public static void main(String [] klhjh){
Scanner mm = new Scanner(System.in);
System.out.print("Enter any Alphabet from a-c : ");
int num = mm.nextAtChar();
switch(num){
case a:{
System.out.println("First");
break;
}case b:{
System.out.println("Second");
break;
}case c:{
System.out.println("Third");
break;
}
default:{
System.out.println("Incorrect");
}
}
}
}