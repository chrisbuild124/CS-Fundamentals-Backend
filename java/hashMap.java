import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

HashMap<Integer, Integer> indices1 = new HashMap<>();
indices1.put(1, 2);        // pushes key value pair
indices1.get(1);           // Get value
indices1.containsKey(1);   // Contains key boolean
indices1.remove(1);        // Remove pair
indices1.clear();          // Clear entire hashmap
indices1.putIfAbsent(1, 1); // Add default value

Map<Integer, Integer> indices2 = new HashMap<>(); // More flexible approach (can use with trees)
indices2.put(1, 2);        // pushes key value pair
indices2.get(1);           // Get value
indices2.containsKey(1);   // Contains key boolean
indices2.remove(1);        // Remove pair
indices2.clear();          // Clear entire hashmap
indices2.putIfAbsent(1, 1); // Add default value

Map<String, List<String>> res = new HashMap<>(); // Return list of lists based on key
res.putIfAbsent(key, new ArrayList<>());
res.get(key).add(string);
return new ArrayList<>(res.values());
