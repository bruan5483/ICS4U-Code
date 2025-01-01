/**
 * @author Bryant Ruan
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
     * This code checks if the given year is a leap year
     * A special rule regarding leap years is that if the year is divisible by 100, it also has to be divisible by 400 to be considered a leap year
     * Otherwise, years that are divisible by 4 are leap years
     */
    
    // This checks if the year is divisible by 400 (if it is, it returns true)
    if (year%400==0) {
      return true;
    
    // Since the "if" statement already checked if the given year is divisible by 400, if the program finds that the given year is divisible by 100, the year will NOT be a leap year and the program will return False
    } else if (year%100==0) {
      return false;
    
    // This will check if the year is divisble by 4. Remaining years that are divisible by 4 are leap years since the exceptions are handled in the previous lines (returns True if the year is divisible by 4)
    } else if (year%4==0) {
      return true;
   
    // All years that are not divisible by 4 are not leap years and the program will return False
    } else {
      return false;
    }
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
