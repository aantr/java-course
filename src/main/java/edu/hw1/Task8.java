package edu.hw1;

public class Task8 {

    public static boolean knightBoardCapture(int[][] a) {
        int[][] moves = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    int I = i + moves[k][0], J = j + moves[k][1];
                    if (I < 8 && J < 8 && I >= 0 && J >= 0 && a[i][j] == 1&& a[I][J] == 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
