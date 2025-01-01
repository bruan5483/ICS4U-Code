## Instructions

This program is mostly completed with one section missing. It counts how many times the word "thou" appears in various Shakespearean plays. Four plays are included in the program as text files.

Your task is to complete the missing section. All that's left is to check whether the variable `token` has the word "thou" in it and increase the variable `count` by 1 if this is true.

Examples of tokens that contain the word "thou" include:

- thou
- Thou
- thou,
- Thou:
- thou!
- thou'rt
- --thou
- thou-
- ... etc.

Here is what the program should print:

```
The number of times "thou" appears in Hamlet is: 107
The number of times "thou" appears in Macbeth is: 96
The number of times "thou" appears in Othello is: 145
The number of times "thou" appears in Romeo and Juliet is: 278
```

**Don't worry if your results aren't exact, as long as they are fairly close.**

**Hint 1:** Find a regular expression that catches all punctuation marks. 

**Hint 2:** Treat cases with internal punctuation marks such as _thou'rt_ separately.

**Hint 3**: Some tokens contain two words separated by -- and no whitespace. This is the only case in this program in which a token is actually two words.

## Main.java

Here is the original code in *Main.java* for reference:

```java
/**
 * @author name
 */
 
import java.io.*; 
import java.util.Scanner;

public class Main {

  /**
   * Takes a filename and returns the number of times the word "thou" appears in it.
   * 
   * @param filename
   * @return int
   * @throws java.io.IOException
   */
  public static int thouCount(String filename) throws IOException {  
    try {
      File file = new File(filename);
      Scanner scanner = new Scanner(file);
            
      int count = 0;
            
      while (scanner.hasNext()) {
        String token = scanner.next();
        /* 
         * Complete this section to check whether *token* contain 
         * the word "thou" in it and increase the count if it does.
         */
      }
      scanner.close();
      return count;
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
      System.out.println("The number of times \"thou\" appears in Hamlet is: " 
                         + thouCount("hamlet.txt"));
      System.out.println("The number of times \"thou\" appears in Macbeth is: " 
                         + thouCount("macbeth.txt"));
      System.out.println("The number of times \"thou\" appears in Othello is: " 
                         + thouCount("othello.txt"));
      System.out.println("The number of times \"thou\" appears in Romeo and Juliet is: " 
                         + thouCount("romeoAndJuliet.txt"));
    } catch (IOException exception) {
        System.out.println("Something is wrong with the file.");
      }
  } 
}
```
