package OldTasks;

import java.util.*;

public class Task0175_CF19A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTeam = in.nextInt();
        int playoff = numberOfTeam / 2;
        Map<String, Team> teamMap = new HashMap<>();

        for (int i = 0; i < numberOfTeam; i++) {
            String temp = in.next();
            teamMap.put(temp, new Team(temp, 0, 0, 1));
        }
        numberOfTeam = (numberOfTeam * (numberOfTeam - 1)) / 2;
        while (numberOfTeam-- > 0) {
            String[] tempName = in.next().split("-");
            String[] tempScore = in.next().split(":");
            int[] score = new int[]{Integer.parseInt(tempScore[0]), Integer.parseInt(tempScore[1])};
            if (score[0] > score[1]) {
                teamMap.get(tempName[0]).point += 3;
                teamMap.get(tempName[0]).goal += score[0];
                teamMap.get(tempName[0]).fail += score[1];
                teamMap.get(tempName[1]).point += 0;
                teamMap.get(tempName[1]).goal += score[1];
                teamMap.get(tempName[1]).fail += score[0];
            } else if (score[0] < score[1]) {
                teamMap.get(tempName[1]).point += 3;
                teamMap.get(tempName[1]).goal += score[1];
                teamMap.get(tempName[1]).fail += score[0];
                teamMap.get(tempName[0]).point += 0;
                teamMap.get(tempName[0]).goal += score[0];
                teamMap.get(tempName[0]).fail += score[1];
            } else {
                teamMap.get(tempName[0]).point += 1;
                teamMap.get(tempName[0]).goal += score[0];
                teamMap.get(tempName[0]).fail += score[1];
                teamMap.get(tempName[1]).point += 1;
                teamMap.get(tempName[1]).goal += score[1];
                teamMap.get(tempName[1]).fail += score[0];
            }
        }
        List<Team> teamList = new ArrayList<>(teamMap.values());
        Collections.sort(teamList);
        int i = 0;
        Set<String> result = new TreeSet<>();
        for (Team team : teamList) {
            result.add(team.name);
            i++;
            if (i == playoff) break;
        }
        result.forEach(System.out::println);
    }

    static class Team implements Comparable<Team> {
        String name;
        int point;
        int goal;
        int fail;

        public Team(String name, int point, int goal, int fail) {
            this.name = name;
            this.point = point;
            this.goal = goal;
            this.fail = fail;
        }

        @Override
        public int compareTo(Team o) {
            var pointCompare = Integer.compare(this.point, o.point);
            if (pointCompare != 0) return pointCompare * -1;
            var compareDiff = Integer.compare(this.goal - this.fail, o.goal - o.fail);
            if (compareDiff != 0) return compareDiff * -1;
            return Integer.compare(this.goal, o.goal) * -1;
        }
    }
}
