/**
 * @author Bryant Ruan
 */

public class Main {

  /*
   * Generates random integers between 0 and 10 for each of these variables. 
   */
  public static int numPennies = (int)(Math.random() * 11);
  public static int numNickels = (int)(Math.random() * 11);
  public static int numDimes = (int)(Math.random() * 11);
  public static int numQuarters = (int)(Math.random() * 11);
  public static int numLoonies = (int)(Math.random() * 11);
  public static int numToonies = (int)(Math.random() * 11);
  
   /**
   * Calculates the total number of coins.
   *
   * @return int numCoins
   */
  public static int totalNumber() {
    /*
     * Adding together number of each type of coin
     */
    int numCoins = numPennies + numNickels + numDimes + numQuarters + numLoonies + numToonies;

    return numCoins;
  }
  
   /**
   * Calculates the amount of money the coins add up to.
   *
   * @return double value
   */
  public static double totalValue() {
    /*
     * Caculating how much each coin is worth and the sum of all coin values
     */
    double valuePennies = 0.01*numPennies;
    double valueNickels = 0.05*numNickels;
    double valueDimes = 0.1*numDimes;
    double valueQuarters = 0.25*numQuarters;
    double valueLoonies = numLoonies;
    double valueToonies = 2*numToonies;
    
    double value = valuePennies + valueNickels + valueDimes + valueQuarters + valueLoonies + valueToonies;
    
    return value;
  }

  /**
   * Calculates the total number of coins and the 
   * amount of money the coins add up to.
   *
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    System.out.println("Number of pennies: " + numPennies);
    System.out.println("Number of nickels: " + numNickels);
    System.out.println("Number of dimes: " + numDimes);
    System.out.println("Number of quarters: " + numQuarters);
    System.out.println("Number of loonies: " + numLoonies);
    System.out.println("Number of toonies: " + numToonies);
    
    System.out.println("Total number of coins: " + totalNumber());
    System.out.format("Total value of coins: $%.2f", totalValue());
  }
}
