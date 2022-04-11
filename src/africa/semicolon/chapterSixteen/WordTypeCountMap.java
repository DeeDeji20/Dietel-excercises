package africa.semicolon.chapterSixteen;

import java.util.*;

public class WordTypeCountMap {
    public static void main(String[] args) {
        Map<String, Integer> wordCountMap = new HashMap<String, Integer>();

        createMap(wordCountMap);
        displayMap(wordCountMap);
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<String>(keys);
        System.out.printf("%nMap contains: %n Keys\t\tVslue%n");

        for (String key : sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }

    private static void createMap(Map<String, Integer> map) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scan.nextLine();

        String[] tokens = input.split(" ");
        for (String token : tokens) {
            token = token.toLowerCase();
            if (map.containsKey(token)) {
                int count = map.get(token);
                map.put(token, count+1);
            }else map.put(token, 1);
        }
    }

}
