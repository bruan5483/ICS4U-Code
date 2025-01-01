## Instructions

Complete the method `replaceName()` so that it replaces all occurrences of `oldName` in `filename` with `newName`. For example, `replaceName("romeoAndJuliet.txt", "Romeo", "Bob")` would replace all occurrences of "Romeo" with "Bob" in the file. 

As an additional challenge, see if you can get the capitalization to match. For example, "Romeo" would be replaced with "Bob", "romeo" would be replaced with "bob", and ROMEO" would be replaced with "BOB".

**Tip**: Save a copy of the original text files so that they're not lost when they are overwritten.

## Main.java

Here is the original code in *Main.java* for reference:

```
/**
 * @author name
 */
 
import java.io.*; 
import java.util.Scanner;

public class Main {

  /**
   * Replaces all occurrences of *oldName* in *filename* with *newName*.
   *
   * @param filename
   * @param oldName
   * @param newName
   * @throws java.io.IOException when the input file is missing
   */
  public static void replaceName(String filename, String oldName, String newName) throws IOException {
    try {
      /*
       * What goes here?
       */
    } catch (IOException exception) {
      System.out.println("Something is wrong with one of the files.");
    }
  }
    
  /**
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    try {

    } catch (IOException exception) {
      System.out.println("Something is wrong with the file.");
    }
  }  
}

```