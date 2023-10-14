package edu.hw1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task6 {

    public static int kaprekar(int x) {
        int ans = 0;
        while (x != 6174) {
            ans++;
            char[] arr = Integer.toString(x).toCharArray();
            Arrays.sort(arr);
            int res = -Integer.parseInt(String.valueOf(arr));
            for (int i = 0; i < arr.length / 2; i++) {
                char t = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = arr[i];
                arr[i] = t;
            }
            res += Integer.parseInt(String.valueOf(arr));
            x = res;
        }
        return ans;
    }

}
