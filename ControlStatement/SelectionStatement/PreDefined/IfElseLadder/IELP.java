class IELP{
public static void main(String [] mn){
int s1=50,s2=56,s3=52,s4=66,per;
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
}else {
System.out.println("You have Failed  grade 'F': "+ per);
}


}
}