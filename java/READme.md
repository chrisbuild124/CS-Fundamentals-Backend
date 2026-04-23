### General Java rules
- Imports must be at top of file
- Everything requires to be in a class
  - Could be enums, interface, or record instead
  - Main class:
    ```java
      public class FileName { // class name MUST match file name if public
          public static void main(String[] args) { // main is required entry point
              System.out.println("Hello World");
          }
      }
