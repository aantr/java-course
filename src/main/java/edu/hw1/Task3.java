package edu.hw1;

public class Task3 {
    public static boolean isNestable(int[] a, int[] b) {
        int mna = a[0];
        int mnb = b[0];
        int mxa = a[0];
        int mxb = b[0];
        for (int i = 0; i < a.length; i++) {
            mna = Math.min(mna, a[i]);
            mxa = Math.max(mxa, a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            mnb = Math.min(mnb, b[i]);
            mxb = Math.max(mxb, b[i]);
        }

        return mna > mnb && mxa < mxb;
    }
}
