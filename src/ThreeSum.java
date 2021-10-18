import java.util.*;
import java.util.stream.Collectors;

class ThreeSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        ArrayList<Integer[]> list = new ArrayList();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int leftPointer = i + 1;
            int rightPointer = array.length - 1;
            while (leftPointer < rightPointer) {
                if (array[i] + array[leftPointer] + array[rightPointer] == targetSum) {
                    Integer[] triplet = new Integer[]{array[i], array[leftPointer], array[rightPointer]};
                    list.add(triplet);
                    leftPointer++;
                    rightPointer--;
                }else if(array[i] + array[leftPointer] + array[rightPointer]>targetSum){
                    rightPointer--;
                }else{
                    leftPointer++;
                }
            }
        }
//        list.stream().sorted(Comparator.<Integer[]>comparingInt(a -> a[0]).thenComparingInt(a -> a[1])).collect(Collectors.toList());
        return list;
    }
}
