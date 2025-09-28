public class Pattern_5 {
    public static void main(String[] args) {
        int m  = 4;

        for (int i = 1; i<=m; i++){
            for (int j=1; j<=m-1; j++){
                System.out.print("");
            }
            
         for (int j= 1; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
        }
    }
}
