import org.junit.Assert;

import java.util.*;
import java.util.stream.Collectors;

class MoveElementToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        int i = 0;
        int j = array.size() - 1;
        while (i < j) {
            while (array.get(j) == toMove && i < j) {
                j--;
            }
            while (array.get(i) != toMove && i < j) {
                i++;
            }
            Integer swap1 = array.get(i);
            Integer swap2 = array.get(j);
            array.set(i, swap2);
            array.set(j, swap1);
            i++;
            j--;
        }
        return array;
    }
}
