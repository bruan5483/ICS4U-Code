## Instructions

Complete the given program so that the function `timeConversion()` takes a number of seconds and return how much time it is equivalent to using a combination of days, hours, minutes, and seconds. 

When the program is run, it should print the following:

```
60 seconds is equal to:
0 day(s), 0 hour(s), 1 minute(s), 0 second(s)

5000 seconds is equal to:
0 day(s), 1 hour(s), 23 minute(s), 20 second(s)

100000 seconds is equal to:
1 day(s), 3 hour(s), 46 minute(s), 40 second(s)
```

**Hint 1:** Consider using the `//` and `%` operators. You may also use any built-in methods.

**Hint 2**: Use `replace()` from the **About Me** assignment to make it simpler to format the strings.

**Hint 3**: You can use the website Wolfram|Alpha to check your answers. Example: https://www.wolframalpha.com/input/?i=100000+seconds.

## Main.java

Here is the original code in *Main.java* for reference:

```java
/**
 * @author name
 */

public class Main {
  
  /**
   * Calculates how much time *seconds* is equivalent to using a combination of days, hours, minutes, and seconds.
   *
   * @param seconds 
   * @return int
   */
  public static String timeConversion(int seconds) {
    /*
     * What goes here?
     */
    return "";
  }

  /**
   * 
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    System.out.println("60 seconds is equal to: ");
    System.out.println(timeConversion(60));

    System.out.println("5000 seconds is equal to: ");
    System.out.println(timeConversion(5000));

    System.out.println("100000 seconds is equal to: ");
    System.out.println(timeConversion(100000));
  }
}
```
