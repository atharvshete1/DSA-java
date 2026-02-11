public class problem1 {
    static int count = 0;

    public static void tile(int n) {
        if (n < 0) {
            return;
        }
        if (n == 0) {
            count++;
            return;
        }

        tile(n - 1);

        if (n != 1) {
            tile(n - 2);
        }
    }

    public static int paired(int n) {
        // base case
        if (n == 2
                || n == 1) {
            return n;
        }

        int singleways = paired(n - 1);
        int doubleways = (n - 1) * paired(n - 2);

        return singleways + doubleways;
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + ((ei - si) / 2);

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        if (si >= ei) {
            return;
        }

        int i = si;
        int j = mid + 1;
        int[] temp = new int[arr.length];
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        i = si;
        for (int v = 0; v <= ei && i <= ei; v++) {
            arr[i] = temp[v];
            i++;
        }

    }

    public static void quick(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int j = si;
        int i = si - 1;
        int k = ei;
        int pivot = arr[k];
        int temp = 0;

        while (j < k) {
            if (arr[j] <= pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        i++;
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

        quick(arr, j, i - 1);
        quick(arr, i + 1, k);
    }

    public static int search(int arr[], int si, int ei, int target) {

        if (si == ei) {
            return si;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            // on Line L1
            if (arr[si] <= target && target <= arr[mid]) {
                // on Left Side of the Mid
                return search(arr, si, mid, target);
            } else {
                return search(arr, mid + 1, ei, target);
            }
        } else {
            // on Line L2
            if (arr[mid + 1] <= target && target <= arr[ei]) {
                return search(arr, mid + 1, ei, target);
            } else {
                return search(arr, si, mid, target);
            }
        }
    }

    public static void subSet(String str, String sb, int i) {
        if (i == str.length()) {
            System.out.print(sb + " ");
            return;
        }

        char currChar = str.charAt(i);

        subSet(str, sb + currChar, i + 1); // yes

        subSet(str, sb, i + 1); // no

    }

    public static void permutation(String str, String sb) {
        if (str.length() == 0) {
            System.out.println(sb + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);

            permutation(newStr, sb + currChar);
        }
    }

    public static boolean isSafe(char[][] board, int row, int column) {
        // Vertical Check

        for (int i = 0; i < row; i++) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }

        // Left Diagonal Check
        int v = column - 1;
        for (int j = row - 1; j >= 0 && v >= 0; j--) {
            if (board[j][v] == 'Q') {
                return false;
            }
            v--;
        }

        // Right Diagonal Check
        int w = column + 1;
        for (int k = row - 1; k >= 0 && w < board[0].length; k--) {
            if (board[k][w] == 'Q') {
                return false;
            }
            w++;
        }

        return true;
    }

    public static void print(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        // System.out.println("----------->><<-----------");
    }

    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            // print(board);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, row, i)) {
                board[row][i] = 'Q';
                nQueens(board, row + 1); // recursive call
                board[row][i] = 'X'; // backtracking
            }
        }

    }

    static int count1 = 0;

    public static void Grid(boolean[][] Grid, int n, int m) {
        if (n == Grid.length - 1 && m == Grid[0].length - 1) {
            count1++;
            return;
        }

        if (n < Grid.length) {
            Grid(Grid, n + 1, m);
        }
        if (m < Grid[0].length) {
            Grid(Grid, n, m + 1);
        }
    }

    public static boolean isSafe(int[][] sudoku, int i, int j, int Digit) {

        // checking vertical (Column)
        for (int v = 0; v < sudoku.length; v++) {
            if (sudoku[v][j] == Digit) {
                return false;
            }
        }

        // checking horizantal (Row)
        for (int k = 0; k < sudoku.length; k++) {
            if (sudoku[i][k] == Digit) {
                return false;
            }
        }

        // checking in Grid

        int sr = (i / 3) * 3;
        int sc = (j / 3) * 3;
        for (int w = sr; w < sr + 3; w++) {
            for (int v = sc; v < sc + 3; v++) {
                if (sudoku[w][v] == Digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean sudoku(int sudoku[][], int i, int j) {
        if (i == sudoku.length) {
            return true;
        }

        int nextCol = j + 1;
        int nextRow = i;
        if (nextCol == 9) {
            nextRow = i + 1;
            nextCol = 0;
        }

        if (sudoku[i][j] != 0) {
            return sudoku(sudoku, nextRow, nextCol);
        }

        for (int k = 1; k < 10; k++) {
            if (isSafe(sudoku, i, j, k)) {
                sudoku[i][j] = k;
                if (sudoku(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[i][j] = 0;
            }
        }

        return false ; 
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
        sudoku(sudoku, 0, 0);
        print(sudoku);
    }
}
