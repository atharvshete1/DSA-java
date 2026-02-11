public class practice1 {
    public static void clearith(int i, int j, int num) {
        int a = (-1) << j;
        int b = (int) Math.pow(2, i) - 1;
        int c = a | b;
        num = num & c;
        System.out.println(num);
    }

    public static boolean ispowerofTwo(int num) {
        if ((num & (num - 1)) == 0) {
            return true;
        }

        return false;
    }

    // check set bit or count set bit
    public static int q1(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    // fast expansion

    public static long fastexpansion(long base, long power) {
        long a = base;
        long sum = 1;
        while (power > 0) {
            if ((power & 1) == 1) {
                sum = (long) (sum * (a * 1));
                System.out.println(sum);
            }
            a = a * a;
            power = power >> 1;

        }
        return sum;
    }

    static int count = 0;

    public static void grid(int[][] Grid, int i, int j) {
        int n = Grid.length; // Row
        int m = Grid[0].length; // Column

        // base case
        if (i == n - 1 && j == m - 1) {
            count++;
            return;
        }

        // recurssion
        if (i < n - 1) {
            grid(Grid, i + 1, j);
        }

        // Backtracking
        if (j < m - 1) {
            grid(Grid, i, j + 1);
        }

    }

    public static boolean isSafe(int arr[][], int digit, int row, int col) {

        // only one digit in row

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] == digit) {
                return false;
            }
        }

        // only one digit in column

        for (int i = 0; i < arr[0].length; i++) {
            if (arr[row][i] == digit) {
                return false;
            }
        }

        // ony one digit in grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (arr[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean Sudoku(int arr[][], int row, int col) {
        // base case
        if (row > 8) {
            return true;
        }

        int nextcol = col + 1;
        int nextrow = row;
        if (nextcol > 8) {
            nextrow = row + 1;
            nextcol = 0;
        }

        if (arr[row][col] != 0) {
           return Sudoku(arr, nextrow, nextcol);
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(arr, i, row, col)) {
                arr[row][col] = i;
                if(Sudoku(arr, nextrow, nextcol))  // important for backtracking 
                    {
                        return true ; 
                    };
            } 
                
            
            arr[row][col] = 0;
        
        }

        return false;

    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },

                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },

                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        if (Sudoku(sudoku, 0, 0) == true) {
            for (int i = 0; i < sudoku.length; i++) {
                for (int j = 0; j < sudoku[0].length; j++) {
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("False Sudoku");
        }
    }
}
