## Instructions

Complete the given program so that the method `isLeapYear()` takes a year and returns a boolean to indicate whether or not it is a leap year.

When the program is run, it should print the following:

```
2020 is a leap year.
2019 is NOT a leap year.
2000 is a leap year.
1992 is a leap year.
1900 is NOT a leap year.
```

**Hint:** Search online to learn the rules for determing whether a specific year is a leap year.


## Main.java

Here is the original code in *Main.java* for reference:

```java
/**
 * @author name
 */

public class Main {
  
  /**
   * Calculates whether *year* is a leap year.
   *
   * @param year 
   * @return boolean
   */
  public static boolean isLeapYear(int year) {
    /*
     * What goes here?
     */
    return true;
  }

  /**
   * Generates a string to indicate a leap year or non-leap year.
   *
   * @param bool
   * @return String
   */
  public static String leapYearString(boolean bool) {
    return bool ? "is a leap year." : "is NOT a leap year";
  }

  /**
   * 
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    System.out.println("2020 " + leapYearString(isLeapYear(2020)));
    System.out.println("2019 " + leapYearString(isLeapYear(2019)));
    System.out.println("2000 " + leapYearString(isLeapYear(2000)));
    System.out.println("1992 " + leapYearString(isLeapYear(1992)));
    System.out.println("1900 " + leapYearString(isLeapYear(1900)));
  }
}
```
