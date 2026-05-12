import java.util.Arrays;
import java.util.stream.IntStream;

int[] arr = {1, 2, 3, 4};
int sum = Arrays.stream(arr).sum(); // Stream allows chaining

IntStream stream = Arrays.stream(arr);
Arrays.stream(arr).toArray()

Arrays.stream(arr).filter(x -> x > 0)          // keep elements matching condition
Arrays.stream(arr).map(x -> x * 2)             // transform each element
Arrays.stream(arr).distinct()                  // remove duplicates
Arrays.stream(arr).sorted()                    // sort elements

// Example
class Solution {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }
}
