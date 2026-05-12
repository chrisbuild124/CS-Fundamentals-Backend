import java.util.Arrays;

// Normal char array
char[] str_arr = {'1', '1'};
str_arr[0] = '0'; // must be '' for char; "" for string
int len1 = str_arr.length;

// Special string array
String new_str = "12345";
int len2 = new_str.length();
char c = new_str.charAt(2);
int idx = c - 'a';
