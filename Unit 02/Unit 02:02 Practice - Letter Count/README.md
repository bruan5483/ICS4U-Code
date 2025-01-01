## Instructions
Complete the method `letterCount()` so that it takes a filename and it returns the number of alphabet characters in the file. Four Shakesperean plays are included in the program as text files for you to test your method on.

When the program is run, it should print the following:

```
The number of letters in Hamlet is: 135071
The number of letters in Macbeth is: 77579
The number of letters in Othello is: 115304
The number of letters in Romeo and Juliet is: 105891
```

## Main.java

Here is the original code in case you need to refer to it:

```java
/**
 * @author name
 */
 
import java.io.*; 
import java.util.Scanner;

public class Main {

  /**
   * Takes a filename and returns the number of alphabet characters in it.
   * 
   * @param filename 
   * @return int
   * @throws java.io.IOException
   */
  public static int letterCount(String filename) throws IOException {  
    try {
      /*
       * What goes here?
       */ 
      return 0;
    } catch (IOException exception) {
      System.out.println("Something is wrong with the file.");
      return 0;
    }
  }
    
  /**
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    try {
      System.out.println("The number of letters in Hamlet is: " 
                         + letterCount("hamlet.txt"));
      System.out.println("The number of letters in Macbeth is: " 
                         + letterCount("macbeth.txt"));
      System.out.println("The number of letters in Othello is: " 
                         + letterCount("othello.txt"));
      System.out.println("The number of letters in Romeo and Juliet is: " 
                         + letterCount("romeoAndJuliet.txt"));
    } catch (IOException exception) {
        System.out.println("Something is wrong with the file.");
    }
  }
}

```
