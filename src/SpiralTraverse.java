import java.util.*;

class SpiralTraverse {
    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        int startRow = 0;
        int startColume = 0;
        int endRow = array.length - 1;
        int endColume = array[0].length - 1;
        List<Integer> resultArray = new ArrayList<>();
        while (startColume <= endColume && startRow <= endRow) {
            for (int i = startColume; i <= endColume; i++) {
                resultArray.add(array[startRow][i]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                resultArray.add(array[i][endColume]);
            }
            for (int i = endColume - 1; i >= startColume; i--) {
                if(startRow == endRow) break;
                resultArray.add(array[endRow][i]);
            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if(startColume == endColume) break;
                resultArray.add(array[i][startColume]);
            }
            startRow++;
            endColume--;
            endRow--;
            startColume++;
        }
        return resultArray;
    }
    //1 ,2 ,3 ,4
    //10,11,12,5,
    //9 ,8 ,7 ,6
}
