import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
      Map<Integer, Integer> indices = new HashMap<>();
      indices.put(1, 2); // pushes key value pair
      indices.get(1); // Get value
      indices.containsKey(1); // Contains key boolean
      indices.remove(1); // Remove pair
      indices.clear(); // Clear entire hashmap
}
