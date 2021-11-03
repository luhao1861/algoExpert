import java.util.*;

class LongestPeak {
    public static int longestPeak(int[] array) {
        // Write your code here.
        int longestPeak = 0;
        if (array.length < 3) return longestPeak;
        for (int i = 1; i < array.length - 1; i++) {
            int j = i - 1;
            int k = i + 1;
            if (array[i] > array[j] && array[i] > array[k]) {
                while (j >= 1 && array[j] > array[j - 1]) {
                    j--;
                }
                while (k <= array.length - 2 && array[k] > array[k + 1]) {
                    k++;
                }
                longestPeak = longestPeak > k - j + 1 ? longestPeak : k - j + 1;
            }
        }
        return longestPeak;
    }

}
