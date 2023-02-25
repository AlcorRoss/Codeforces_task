import java.util.*;

public class Task0088_CF1789C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfTests = in.nextInt();

        while (numberOfTests-- > 0) {
            int numberOfValues = in.nextInt();
            int numberOfOperations = in.nextInt();
            int counter = 0;
            List<ArrayList<Integer>> listLists = new ArrayList<>();
            ArrayList<Integer> mainList = new ArrayList<>();

            for (int i = 0; i < numberOfValues; i++) {
                mainList.add(in.nextInt());
            }
            listLists.add(mainList);

            for (int i = 0; i < numberOfOperations; i++) {
                int index = in.nextInt() - 1;
                int newValue = in.nextInt();
                ArrayList<Integer> tempList = (ArrayList) listLists.get(listLists.size() - 1).clone();
                tempList.set(index, newValue);
                listLists.add(tempList);
            }

            for (int i = 0; i < listLists.size() - 1; i++) {
                for (int j = i + 1; j < listLists.size(); j++) {
                    Set<Integer> tempset = new HashSet<>();
                    tempset.addAll(listLists.get(i));
                    tempset.addAll(listLists.get(j));
                    counter += tempset.size();
                }
            }
            System.out.println(counter);
        }
    }
}
