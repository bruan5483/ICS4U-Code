/**
 * @author Bryant Ruan
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

    //while loop essentially checks if a, b, and c are integers by seeing if there is any remainder when they are each divided by 1
    //if there is a remainder for any of them, all 3 numbers are multiplied by 10 until they are all have no remainder
    while (a%1!=0 || b%1!=0 || c%1!=0){
      a*=10;
      b*=10;
      c*=10;
    }
    //calculate the discriminant (b^2-4ac)
    double discriminant = b*b-(4*a*c);
    //set up int numRoots to hold the number of roots
    int numRoots = 0;
    //if the discriminant is greater than 0, there are 2 real roots. if the discriminant is equal to 0, there is 1 real root. if the discriminant is less than 1, there are no real roots. 
    if (discriminant>0){
      numRoots = 2;
    } else if (discriminant==0){
      numRoots = 1;
    } else {
      numRoots = 0;
    }

    //return the number of roots
    return numRoots;
  }


  /**
   * 
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    System.out.println("The quadratic relation y = 4x^2 - 10 has " + numRoots(4, 0, -10) + " real root(s).");
    System.out.println("The quadratic relation y = 2.5x^2 - x + 12.2 has " + numRoots(2.5, -1, 12.2) + " real root(s).");
    System.out.println("The quadratic relation y = x^2 + 6.4x + 10.24 has " + numRoots(1, 6.4, 10.24) + " real root(s).");
  }
}