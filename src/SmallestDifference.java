import java.util.*;

class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int firstPointer = 0;
        int secondPointer = 0;
        int numberOne = 0;
        int numberTwo = 0;
        int closeDiffirence = Math.abs(arrayTwo[secondPointer] - arrayOne[firstPointer]);
        while (firstPointer < arrayOne.length && secondPointer < arrayTwo.length) {
            if (arrayOne[firstPointer] < arrayTwo[secondPointer]) {
                if (arrayTwo[secondPointer] - arrayOne[firstPointer] < closeDiffirence) {
                    closeDiffirence = arrayTwo[secondPointer] - arrayOne[firstPointer];
                    numberOne = arrayOne[firstPointer];
                    numberTwo = arrayTwo[secondPointer];
                }
                firstPointer++;
            } else{ //arrayOne[firstPointer] > arrayTwo[secondPointer]
                if (arrayOne[firstPointer] - arrayTwo[secondPointer] < closeDiffirence) {
                    closeDiffirence = arrayOne[firstPointer] - arrayTwo[secondPointer];
                    numberOne = arrayOne[firstPointer];
                    numberTwo = arrayTwo[secondPointer];
                }
                secondPointer++;
            }
        }
        return new int[]{numberOne, numberTwo};
    }
}
