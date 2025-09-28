public class Pattern_13 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }

        // 1st half numbers 
            for (int j = i; j>=1; j--){
                System.out.print(j);
            }

        // 2nd Half No.
             for ( int j=2 ; j<=1; j++){
                System.out.print(j);
             }    
             System.out.println();

        }
    }
}