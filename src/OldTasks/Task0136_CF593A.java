package OldTasks;

import java.util.*;

public class Task0136_CF593A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfValues = in.nextInt();
        List<String> words = new ArrayList<>();
        char tempChar;
        TreeSet<Character> usedCharacter = new TreeSet<>();
        String temp;
        int result = 0;
        List<Integer> results = new ArrayList<>();

        while (numberOfValues-- > 0) {
            temp = in.next();
            Set<Character> tempSet = new HashSet<>();
            for (int i = 0; i < temp.length(); i++) tempSet.add(temp.charAt(i));
            if (tempSet.size() < 3) {
                words.add(temp);
                usedCharacter.addAll(tempSet);
            }
        }
        if (words.size() == 0) {
            System.out.println(0);
            return;
        }
        if (usedCharacter.size() == 1) {
            for (String word : words) result += word.length();
            System.out.println(result);
            return;
        }
        while (!usedCharacter.isEmpty()) {
            tempChar = usedCharacter.first();
            usedCharacter.remove(tempChar);
            for (Character character : usedCharacter) {
                result = 0;
                for (String word : words) {
                    Set<Character> tempSet = new HashSet<>();
                    for (int i = 0; i < word.length(); i++) tempSet.add(word.charAt(i));
                    if (tempSet.size() == 1 && tempSet.contains(tempChar)
                            || tempSet.size() == 1 && tempSet.contains(character)
                            || tempSet.contains(character) && tempSet.contains(tempChar))
                        result += word.length();
                }
                results.add(result);
            }
        }
        if (words.size() == 1) System.out.println(words.get(0).length());
        else System.out.println(Collections.max(results));

    }
}
























