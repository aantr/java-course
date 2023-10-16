package edu.hw1;

public class Task2 {
    public static int countDigits(int x) {
        int ans = 0;
        while (x > 0) {
            ans++;
            x /= 10;
        }
        return Math.max(1, ans);
    }
}
