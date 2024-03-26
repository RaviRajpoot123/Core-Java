public class Pattern9 {
    public static void main(String [] dsc){
        for(int i = 1 ; i<=5; i++){
            for(int j = 1 ; j <= i ; j++){
                if (i%2==j%2) {
                    System.out.print("1"+" ");
                }
            else {
                    System.out.print("0"+" ");
                }
            }System.out.println();
        }

    }
}
