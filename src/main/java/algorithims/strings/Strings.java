package algorithims.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Strings {

    public static int getNumberOfSubStrings(String s) {
        int n = s.length();
        return n * (n + 1) / 2;
    }


    public static int getMaxFreqDeviation(String s) {
        ArrayList<Integer> deviations = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                deviations.add(getDeviation(s.substring(i, j)));
            }
        }

        Collections.sort(deviations);

        return deviations.get(deviations.size() - 1);

    }

    private static int getDeviation(String substring) {
        HashMap<Character, Integer> characters = new HashMap();

        for (int i = 0; i < substring.length(); i++) {
            char current = substring.charAt(i);
            if (characters.containsKey(current)) {
                characters.put(current, characters.get(current) + 1);
            } else {
                characters.put(current, 1);
            }
        }

        int max = characters.entrySet().stream().min(Map.Entry.comparingByValue()).get().getValue();

        int min = characters.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();

        return Math.abs(max - min);

    }

}
