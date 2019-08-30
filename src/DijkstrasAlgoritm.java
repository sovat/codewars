import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DijkstrasAlgoritm {

    private static Map<String, Map<String, Double>> graph = new HashMap<>();

    private static List<String> processed = new ArrayList<>();


    private static String findLowestNode(Map<String, Double> costs) {
        Double lowerCost = Double.POSITIVE_INFINITY;
        String lowerCostNode = null;
        for (Map.Entry<String, Double> node : costs.entrySet()) {
            Double cost = node.getValue();
            if (cost < lowerCost && !processed.contains(node.getKey())) {
                lowerCost = cost;
                lowerCostNode = node.getKey();
            }
        }
        return lowerCostNode;
    }


    public static void main(String[] args) {

        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 6.0);
        graph.get("start").put("b", 2.0);

        graph.put("a", new HashMap<>());
        graph.get("a").put("fin", 1.0);

        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 3.0);
        graph.get("b").put("fin", 5.0);

        graph.put("fin", new HashMap<>());


        Map<String, Double> costs = new HashMap<>();
        costs.put("a", 6.0);
        costs.put("b", 2.0);
        costs.put("fin", Double.POSITIVE_INFINITY);

        Map<String, String> parents = new HashMap<>();

        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);

        String node = findLowestNode(costs);

        while (node != null) {
            Double cost = costs.get(node);
            Map<String, Double> neughbors = graph.get(node);
            for (String s : neughbors.keySet()) {
                double newCost = cost + neughbors.get(s);
                if (costs.get(s) > newCost) {
                    costs.put(s, newCost);
                    parents.put(s, node);
                }
            }
            processed.add(node);
            node = findLowestNode(costs);
        }

        System.out.println("Cost from the start to each node:");
        System.out.println(costs); // { a: 5, b: 2, fin: 6 }

    }
}
