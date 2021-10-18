import java.util.*;

class SortedSquaredArray {

    public int[] sortedSquaredArray(int[] array) {
        // Write your code here.
//        int[] newArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i] * array[i];
//        }
//        Arrays.sort(newArray);
//        return newArray;


//        int[] outputArray = new int[array.length];
//        int i = 0;
//        int j = array.length - 1;
//        int k = array.length - 1;
//        while (i <= j) {
//            int a;
//            int b;
//            a = array[i] < 0 ? -array[i] : array[i];
//            b = array[j] < 0 ? -array[j] : array[j];
//            if (a > b) {
//                outputArray[k] = a * a;
//                i++;
//            } else {
//                outputArray[k] = b * b;
//                j--;
//            }
//            k--;
//        }
//        return outputArray;
        int[] outputArray = new int[array.length];
        int smallerIndex = 0;
        int biggerIndex = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (Math.abs(array[smallerIndex]) < Math.abs(array[biggerIndex])) {
                outputArray[i] = array[biggerIndex] * array[biggerIndex];
                biggerIndex--;
            } else {
                outputArray[i] = array[smallerIndex] * array[smallerIndex];
                smallerIndex++;
            }
        }
        return outputArray;
    }
}
