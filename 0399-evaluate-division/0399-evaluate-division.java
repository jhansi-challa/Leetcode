import java.util.*;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> adj_list = new HashMap<>();

        // Build the graph
        for (int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            double w = values[i];

            adj_list.putIfAbsent(u, new HashMap<>());
            adj_list.putIfAbsent(v, new HashMap<>());

            adj_list.get(u).put(v, w);
            adj_list.get(v).put(u, 1.0 / w);
        }

        double[] res = new double[queries.size()];
        for (int j = 0; j < queries.size(); j++) {
            String src = queries.get(j).get(0);
            String dst = queries.get(j).get(1);
            Set<String> visited = new HashSet<>();
            res[j] = dfs(adj_list, src, dst, visited);
        }

        return res;
    }

    private double dfs(Map<String, Map<String, Double>> adj_list, String src, String dst, Set<String> visited) {
        // If source or destination does not exist
        if (!adj_list.containsKey(src) || !adj_list.containsKey(dst)) {
            return -1.0;
        }

        // Direct connection
        if (adj_list.get(src).containsKey(dst)) {
            return adj_list.get(src).get(dst);
        }

        visited.add(src);

        // Explore neighbors
        for (Map.Entry<String, Double> neighbor : adj_list.get(src).entrySet()) {
            String next = neighbor.getKey();
            if (!visited.contains(next)) {
                double val = dfs(adj_list, next, dst, visited);
                if (val != -1.0) {
                    return neighbor.getValue() * val;
                }
            }
        }

        return -1.0; // no path found
    }
}


