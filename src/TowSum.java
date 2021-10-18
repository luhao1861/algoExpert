import java.util.Arrays;

class TowSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
//        int currentNum;
//        int targetNum;
//        HashSet<Integer> hs = new HashSet<>();
//        for (int i = 0; i < array.length; i++) {
//            currentNum = array[i];
//            targetNum = targetSum - currentNum;
//            if (hs.contains(targetNum)) {
//                return new int[]{currentNum, targetNum};
//            } else {
//                hs.add(currentNum);
//            }
//        }
//        return new int[0];


        // Write your code here.
        int h = 0;
        int t = array.length - 1;
        Arrays.sort(array);
        while (h <= t) {
            if (array[h] + array[t] == targetSum) {
                return new int[]{array[h], array[t]};
            } else if (array[h] + array[t] > targetSum) {
                t += -1;
            } else {
                h += 1;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] i = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
        System.out.println(Arrays.toString(TowSum.twoNumberSum(i, 10)));
    }
}
