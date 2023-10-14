package edu.hw1;

public class Task1 {
    public static int minutesToSeconds(String s) {
        if (Integer.parseInt(s.split(":")[1]) >= 60) {
            return -1;
        }
        int ans = Integer.parseInt(s.split(":")[0]) * 60 + Integer.parseInt(s.split(":")[1]);
        return ans;
    }
}
