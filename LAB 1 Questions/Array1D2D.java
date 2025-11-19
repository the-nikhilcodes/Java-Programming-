class Array1D2D {
    public static void main(String[] args) {
        // Single Dimensional Array
        int a[] = {10, 20, 30};

        System.out.println("Single Array:");
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);

        // Multidimensional Array
        int b[][] = {
            {1, 2},
            {3, 4}
        };

        System.out.println("2D Array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(b[i][j] + " ");
            System.out.println();
        }
    }
}
