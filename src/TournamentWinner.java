import java.util.*;

class TournamentWinner {

    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        String winnerTeam = "";
        int winnerScore = 0;
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> competition = competitions.get(i);
            if (results.get(i).intValue() == 1) {
                int score1 = !map.containsKey(competition.get(0)) ? 3 : map.get(competition.get(0)) + 3;
                map.put(competition.get(0), score1);
                if (score1 > winnerScore){
                    winnerTeam = competition.get(0);
                    winnerScore = score1;
                }
            } else {
                int score2 = !map.containsKey(competition.get(1)) ? 3 : map.get(competition.get(1)) + 3;
                map.put(competition.get(1), score2);
                if (score2 > winnerScore){
                    winnerTeam = competition.get(1);
                    winnerScore = score2;
                }
            }
        }
        return winnerTeam;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("Bulls", "Eagles"));
        competitions.add(competition1);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(1));
        System.out.println(new TournamentWinner().tournamentWinner(competitions, results));
    }
}
