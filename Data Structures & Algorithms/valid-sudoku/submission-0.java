class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (char c : board[i]) {
                if (c == '.') {
                    continue;
                }

                if (set.contains(c)) {
                    return false;
                }
                set.add(c);
            }
        }

        for (int i = 0; i < board[0].length; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                char c = board[j][i];
                if (c == '.') {
                    continue;
                }
                if (set.contains(c)) {
                    return false;
                }
                set.add(c);
            }
        }

        for (int rowStart = 0; rowStart < 9; rowStart += 3) {
            for (int colStart = 0; colStart < 9; colStart += 3) {
                HashSet<Character> set = new HashSet<>();
                for (int row = rowStart; row < rowStart + 3; row++) {
                    for (int col = colStart; col < colStart + 3; col++) {
                        char c = board[row][col];
                        if (c == '.') {
                            continue;
                        }
                        if (set.contains(c)) {
                            return false;
                        }
                        set.add(c);
                    }
                }
            }
        }
        return true;
    }
}
