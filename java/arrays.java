// Static Arrays

String[] str_arr; // Initialize Array
String[] str_arr = {"1", "2", "3", "4"}; // Change values
int[] arr = {10, 20, 30, 40}; // Initialize array w/ values
int[] arr = new int[2]; // Empty array - 0 is initialized at first

// Modify
str_arr[0] = "0";

// Retrieve
str_arr[0];

// Dynamic array in java

import java.util.ArrayList;
ArrayList<Integer> list = new ArrayList<>();
list.add(10);  // append

// No slicing. Instead:
import java.util.Arrays;
int[] arr = {10, 20, 30, 40, 50};
int[] newArr = Arrays.copyOfRange(arr, 1, 4); 

// Get length of array
int len = arr.length; // Since array is array object
String s = "hello";
int len = s.length(); // Since s is a string object

// 2D array
int[][] grid = new int[3][4]; // 3 rows, 4 columns
for (int i = 0; i < grid.length; i++) {
    for (int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j] + " ");
    }
    System.out.println();
}
