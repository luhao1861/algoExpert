import java.lang.reflect.Array;
import java.util.*;

class NonConstructibleChange {

    public int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);
        int amountPre = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amountPre + 1) {
                amountPre += coins[i];
            } else {
                return amountPre + 1;
            }
        }
        return amountPre + 1;
    }
}
