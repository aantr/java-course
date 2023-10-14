package edu.hw1;

public class Task4 {
    public static String fixString(String s) {
        String neww = "";
        for (int j = 1; j < s.length(); j += 2) {
            neww += s.charAt(j);
            neww += s.charAt(j - 1);
        }
        if (s.length() % 2 == 1) {
            neww += s.charAt(s.length() - 1);
        }
        return neww;
    }

}
