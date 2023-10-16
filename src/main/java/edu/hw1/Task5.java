package edu.hw1;

public class Task5 {

    static boolean isPal(int x) {
        StringBuilder reverseString = new StringBuilder(Integer.toString(x));
        reverseString.reverse();
        return Integer.toString(x).equals(reverseString.toString());
    }

    public static boolean isPalindromeDescendant(int x) {
        boolean res = true;
        while (x >= 10) {
            if (!isPal(x)) {
                return false;
            }
            String r = "";
            String n = Integer.toString(x);
            for (int i = 0; i < n.length() - 1; i+=2) {
                r += Integer.toString(Integer.parseInt(String.valueOf(n.charAt(i))) +
                    Integer.parseInt(String.valueOf(n.charAt(i + 1))));
            }
            x = Integer.parseInt(r);
        }
        return true;
    }

}
