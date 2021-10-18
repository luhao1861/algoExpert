import java.util.*;

class Program {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int num = 0;
        ArrayList<Integer> excludedList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if(toMove != array.get(i)){
                excludedList.add(array.get(i));
            }else{
                num++;
            }
        }
        for (int i = 0; i < num; i++) {
            excludedList.add(toMove);
        }
        return excludedList;
    }
}
