import java.util.Map;
import java.util.HashMap;

HashMap<Integer, Integer> indices1 = new HashMap<>();
indices1.put(1, 2);        // pushes key value pair
indices1.get(1);           // Get value
indices1.containsKey(1);   // Contains key boolean
indices1.remove(1);        // Remove pair
indices1.clear();          // Clear entire hashmap

Map<Integer, Integer> indices2 = new HashMap<>(); // More flexible approach (can use with trees)
indices2.put(1, 2);        // pushes key value pair
indices2.get(1);           // Get value
indices2.containsKey(1);   // Contains key boolean
indices2.remove(1);        // Remove pair
indices2.clear();          // Clear entire hashmap
