/*
Maximum difference between Even and Odd Frequency
 */

// import the HashMap class
import java.util.*;


public class Main {
    public static void main(String[] args) {
        String s = "aaabbc";
        maxDifference(s);
    }

    public static int maxDifference(String s) {

        try {
            if (3 <= s.length() && s.length() <= 100) {
                return 0;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");
        }

        String lowerCase = s.toLowerCase();
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        int maxOdd = 0;
        int maxEven = 0;

        for (int freq : charCountMap.values()) {
            if (freq % 2 == 0) {
                maxEven = Math.max(maxEven, freq);
            } else {
                maxOdd = Math.max(maxOdd, freq);
            }
        }

        int diff = maxOdd - maxEven;

        return diff;

    }
}