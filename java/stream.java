import java.util.Arrays;

int[] arr = {1, 2, 3, 4}; // Stream allows chaining
int sum = Arrays.stream(arr).sum();


// Example
class Solution {
    public boolean hasDuplicate(int[] nums) {
        return Arrays.stream(nums).distinct().count() != nums.length;
    }
}
