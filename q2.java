public class q2 {
    public static void main(String[] args) {

        int[] agr = {5, 10, 15, 20, 25};

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matrix[0][1]); // displays element at row 0, col 1

        // Display 2D array in SAME LINE (row by row)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "); // SAME LINE output
            }
            System.out.println(); // moves to next line after each row
        }
    }
}