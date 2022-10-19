package leetocde.easy;

import java.util.*;

class BaseBallGame {
    public int calPoints(String[] operations) {

        if (operations.length < 1) {
            return 0;
        }

        Deque<Integer> scores = new ArrayDeque<>();


        int sum = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+")) {
                int lastScore = scores.pop();
                int score = lastScore + scores.peek();

                scores.push(lastScore);
                scores.push(score);

                sum += score;

            } else if (operations[i].equals("D")) {
                scores.push(2 * scores.peek());
                sum += scores.peek();
            } else if (operations[i].equals("C")) {
                sum -= scores.pop();

            } else {
                int d = Integer.valueOf(operations[i]);
                scores.push(d);
                sum += d;
            }
        }
        return sum;
    }
}