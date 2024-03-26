public class Pattern14 {
    public static void main(String [] dsc){
        for(int i = 1 ; i<=5; i++){
            for(int j = 5 ; j > i ; j--){
                System.out.print("  ");
            }for (int k = 0 ; k<i ;k++){
                System.out.print(" "+(i+k));
            }for(int m = i-1; m>0 ;m--){
                System.out.print(" "+(i-1+ m));
            }
            System.out.println();
        }

    }
}
