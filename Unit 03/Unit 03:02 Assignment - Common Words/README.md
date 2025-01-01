## Instructions

The text file *words.txt* contains the 5000 most common English "words" on the Internet from 2018 according to Google Ngram Viewer.

You will complete the program by implmenting a **binary search algorithm** in the method `isCommonWord()` to check whether any given word is in this list of 5000 words.

**Hint**: You can use `word1.compareTo(word2) < 0` to check whether `word1` comes before `word2` in the alphabet (assuming both words are all lower case).

## Main.java

Here is the original code in *Main.java* for reference:

```java
/**
 * @author name
 */
 
import java.io.*; 
import java.util.Scanner;
import java.util.Arrays; 

public class Main {
  // *commonWordsArray* will store the 5000 words in alphabetical order
  public static String[] commonWordsArray = new String[5000];

  /**
   * Puts each token from the file into commonWordsArray.
   * 
   * @throws java.io.IOException
   */
  public static void generateCommonWordsArray() throws IOException {
    try {
      File file = new File("words.txt");
      Scanner scanner = new Scanner(file);
      // Keeps track of the indices from 0 to 4999
      int index = 0;

      while (scanner.hasNext()) {
        // Adds each word to *commonWordsArray*
        commonWordsArray[index] = scanner.next();
        index++;
      }
      
      // Closes the scanner for good housekeeping
      scanner.close();
    } catch (IOException exception) {
      System.out.println("Something is wrong with the file.");
    }
  }

  /**
   * Takes a string and indicates whether it is in the
   * array commonWordsArray. 
   * 
   * Words are not case-sensitive (i.e. capitalization doesn't matter).
   * 
   * Uses a binary search algorithm for efficiency.
   * 
   * @param word 
   * @return boolean
  */
  public static boolean isCommonWord(String word) {
    /* 
     * Complete this method according to its specifications.
     */
    return true;
  }
    
  /**
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    try {
      generateCommonWordsArray();
      /**
       * Write your own tests here
       */
          
    } catch (IOException exception) {
      System.out.println("Something is wrong with the file.");
    }
  }
}

```
