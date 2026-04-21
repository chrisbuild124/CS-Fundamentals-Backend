// Some array notation

// Initializer 
String[] cars;
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
int[] myNum = {10, 20, 30, 40};
int[] s_array = new int[26]; // Empty array - 0 is initialized at first

// Modify
cars[0] = "Opel";
s_array[s.charAt(i) - base] += 1; // strings are not arrays in java

// Retrieve
s_array[0];

// Dynamic array in java. Arrays are static in nature in java. Need to re-create array if not static. 
import java.util.ArrayList;
ArrayList<Integer> list = new ArrayList<>();

list.add(10);  // append / push
list.add(20);
list.add(30);

// No slicing. Instead:
import java.util.Arrays;
int[] arr = {10, 20, 30, 40, 50};
int[] newArr = Arrays.copyOfRange(arr, 1, 4); 
// gives {20, 30, 40}

// Search array: Must use for loop

// Get length of array
int len = arr.length; // Since array is array object
String s = "hello";
int len = s.length(); // Since s is a string object
