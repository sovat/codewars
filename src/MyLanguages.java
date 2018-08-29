import java.util.*;
import java.util.stream.Collectors;


/*Given a dictionary/hash/object of languages and your respective test results, return the list of languages where your test score is at least 60, in descending order of the results.

Note: There will be no duplicate values.*/


public class MyLanguages {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        ArrayList<String> list = new ArrayList<>();

        Map<String, Integer> sorted =
                results.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
            for (String key : sorted.keySet()) {
                if (results.get(key) >= 60)
                list.add(key);
            }
        return list;
    }

    public static void main(String[] args) {
        final Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);
        System.out.println( myLanguages(map2).toString());
    }
}
