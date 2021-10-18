import java.util.List;

class ValidSubsequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
//        int i = 0;
//        int j = 0;
//        while (i < array.size() && j < sequence.size()) {
//            if (array.get(i) == sequence.get(j)) {
//                j++;
//            }
//            i++;
//        }
//        if(j == sequence.size()){
//            return true;
//        }
//        return false;
//    }
        int j = 0;
        for (int i = 0; i < array.size(); i++) {
            if (j == sequence.size()) {
                return true;
            } else if (array.get(i) == sequence.get(j)) {
                j++;
            }
        }
        if (j == sequence.size()) {
            return true;
        }
        return false;
    }
}
