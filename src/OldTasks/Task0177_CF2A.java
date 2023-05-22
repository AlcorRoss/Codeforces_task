package OldTasks;

import java.util.*;

public class Task0177_CF2A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        List<String> data = new ArrayList<>();
        Map<String, Player> players = new HashMap<>();

        for (int i = 0; i < numberOfValues; i++) {
            String name = in.next();
            int tempScore = in.nextInt();
            data.add(name + ":" + tempScore);
            extracted(players, name, tempScore);
        }
        List<Player> result = new ArrayList<>(players.values());
        Collections.sort(result);
        players.clear();
        int max = result.get(0).score;
        Set<String> wins = new HashSet<>();
        for (Player player : result) if (player.score == max) wins.add(player.name);
        for (String datum : data) {
            String[] tempArray = datum.split(":");
            String name = tempArray[0];
            int tempScore = Integer.parseInt(tempArray[1]);
            extracted(players, name, tempScore);
            if (players.get(name).score >= max && wins.contains(name)) {
                System.out.println(name);
                return;
            }
        }
    }

    private static void extracted(Map<String, Player> players, String name, int tempScore) {
        if (players.containsKey(name)) {
            players.get(name).score += tempScore;
        } else players.put(name, new Player(name, tempScore));
    }

    static class Player implements Comparable<Player> {
        String name;
        int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public int compareTo(Player o) {
            return Integer.compare(this.score, o.score) * -1;
        }
    }
}
