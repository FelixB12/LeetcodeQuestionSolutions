
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        boolean valid = true;
        HashSet<Character> set = new HashSet<>();

        // First Test Horizontal
        for (int i = 0; i < board[0].length; i++) {
            for (int k = 0; k < board[0].length; k++) {
                if (board[i][k] == '.') {
                    continue;
                }
                if (set.contains(board[i][k])) {
                    return false;
                } else {
                    set.add(board[i][k]);
                }
            }
            set.clear();
        }

        // Second Test Veritical
        for (int i = 0; i < board[0].length; i++) {
            for (int k = 0; k < board[0].length; k++) {
                if (board[k][i] == '.') {
                    continue;
                }

                if (set.contains(board[k][i])) {
                    return false;
                } else {
                    set.add(board[k][i]);
                }
            }
            set.clear();
        }

        // Test Squars
        if (!testSquares(0, 0, board) || !testSquares(0, 3, board) || !testSquares(0, 6, board)
                || !testSquares(3, 0, board) || !testSquares(3, 3, board) || !testSquares(3, 6, board)
                || !testSquares(6, 0, board) || !testSquares(6, 3, board) || !testSquares(6, 6, board)) {
            return false;
        }
        return valid;
    }

    boolean testSquares(int row, int col, char[][] c) {
        HashSet<Character> set = new HashSet<>();

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (c[i][j] == '.') {
                    continue;
                }

                if (set.contains(c[i][j])) {
                    return false;
                } else {
                    set.add(c[i][j]);
                }
            }
        }
        set.clear();
        return true;
    }
}