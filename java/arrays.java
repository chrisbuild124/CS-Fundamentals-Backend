import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Static Arrays
        String[] str_arr = {"1", "2"};
        str_arr[0] = "0";
        String my_str = str_arr[0];

        int[] arr1 = {10, 20};
        int len1 = arr1.length;

        int[] arr2 = new int[2];

        String s = "hello";
        s.charAt(0) == 'h';
        int strLen = s.length();

        // Dynamic array
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        int val = list.remove(list.size() - 1);

        // Slicing
        int[] arr3 = {10, 20, 30, 40, 50};
        int[] arrNew = Arrays.copyOfRange(arr3, 1, 4);
        String[] strs = {"abc","abcde","abcdef"};
        String newString strs[0].substring(0, 1); // Best way

        // 2D array
        int[][] grid = new int[3][4];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
