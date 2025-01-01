## Instructions

Complete the program so that the method `numRoots()` returns the number of real roots in the quadratic relation *ax^2 + bx + c*.


When the program is run, it should print the following:


```
The quadratic relation y = 4x^2 - 10 has 2 real root(s).


The quadratic relation y = 2.5x^2 - x + 12.2 has 0 real root(s).


The quadratic relation y = x^2 + 6.4x + 10.24 has 1 real root(s).
```


**Hint 1:** What is the discriminant and what does it tell you?


**Hint 2:** To fix rounding errors, consider multiplying *a*, *b*, and *c* by 10 repeatedly until they are all integers.


## Main.java


Here is the original code in *Main.java* for reference:


```java
/**
 * @author name
 */


public class Main {
  
  /**
   * Calculates the number of real roots in the quadratic relation ax^2 + bx + c.
   *
   * @param a
   * @param b
   * @param c
   * @return int
   */
  public static int numRoots(double a, double b, double c) {
    /*
     * What goes here?
     */
    return 0;
  }


  /**
   * 
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    System.out.println("The quadratic relation y = 4x^2 - 10 has " + numRoots(4, 0, -10) + " real root(s).");
    System.out.println("The quadratic relation y = 2.5x^2 - x + 12.2 has " + numRoots(2.5, -1, -12.2) + " real root(s).");
    System.out.println("The quadratic relation y = x^2 + 6.4x + 10.24 has " + numRoots(1, 6.4, -10.24) + " real root(s).");
  }
}