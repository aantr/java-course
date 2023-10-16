package edu.hw1;

public class Task7 {

    public static int rotateLeft(int n, int shift) {
        int x = Integer.highestOneBit(n);
        int b = 0;
        while (x > 0) {
            b++;
            x /= 2;
        }
        x = b - 1;
        return ((n & ((1 << (x + 1 - shift)) - 1)) << shift) |
                ((n & ((1 << (x + 1)) - (1 << (x + 1 - shift)))) >> (x + 1 - shift));
    }

    public static int rotateRight(int n, int shift) {
        int x = Integer.highestOneBit(n);
        int b = 0;
        while (x > 0) {
            b++;
            x /= 2;
        }
        x = b - 1;
        shift %= x + 1;
        return rotateLeft(n, (x + 1 - shift));
    }

}
