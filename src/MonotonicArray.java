import java.util.*;

class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        boolean upward = true;
        boolean downward = true;
        if (array.length <= 2) return true;
        for (int i = 1; i < array.length; i++) {
            if(array[i]<array[i-1]) downward = false;
            if(array[i]>array[i-1]) upward = false;
        }
        return upward || downward;
    }
}
