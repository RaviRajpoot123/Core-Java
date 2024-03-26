import java.util.Scanner;
class IELU{
public static void main(String [] mn){
int per;
System.out.println("Enter numbers of students obtained in all four subject : ");
Scanner mm = new Scanner(System.in);
int s1 = mm.nextInt(); 
int s2 = mm.nextInt(); 
int s3 = mm.nextInt(); 
int s4 = mm.nextInt(); 

if( (s1 <101)&&(s2<101)&&(s3<101)&&(s4<101)){
per = (s1+s2+s3+s4)/4;
if(per > 95){
System.out.println("Exellent ! Grade 'A++' : " + per);

}else if(per > 75 && per< 95){
System.out.println("Good ! Grade 'A+' : " + per);
}else if(per > 65 && per< 75){
System.out.println("Yeah ! Grade 'A' : " + per);
}else if(per > 55 && per< 65){
System.out.println("Hmm! Grade 'B' : " + per);
}else if(per > 35 && per< 55){
System.out.println("Improve ! Grade 'C' : " + per);
}else if(per >0 && per < 35) {
System.out.println("You have Failed  grade 'F': "+ per);
}
}
else {
System.out.println("Numbers of any subject can not exeed 100!");
}

}
}