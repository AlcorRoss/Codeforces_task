package OldTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0046 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int temp;
        StringBuilder st = new StringBuilder();
        String number = bf.readLine();

        temp = Integer.parseInt(number.substring(0, 1));
        if (9 - temp < temp && 9 - temp != 0) {
            st.append(9 - temp);
        } else {
            st.append(temp);
        }

        for (int i = 1; i < number.length(); i++) {
            if (i == number.length() - 1) {
                temp = Integer.parseInt(number.substring(i));
            } else {
                temp = Integer.parseInt(number.substring(i, i + 1));
            }
            temp = Math.min(9 - temp, temp);
            st.append(temp);
        }

        System.out.println(st);
    }
}
