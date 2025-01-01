/*
 * @author Bryant Ruan
 */

public class Main {
  
  /*
   * Calculates how much time *seconds* is equivalent to using a combination of days, hours, minutes, and seconds.
   *
   * @param int seconds 
   * @return string conversion
   */
  public static String timeConversion(int seconds) {
    /*
     * Converts seconds into days first using floor division
     * If there aren't enough seconds to fill a single/another day, the program checks for full hours from the remaining seconds
     * This process is repeated for minutes and then the final remaining seconds are kept
     */
    int days = seconds / 86400; //86400 is the number of seconds in a day
    int remainder1 = seconds % 86400;

    int hours = remainder1 / 3600; //3600 is the number of seconds in an hour
    int remainder2 = remainder1 % 3600;

    int minutes = remainder2 / 60; //60 is the number of seocnds in a minute
    int remainder3 = remainder2 % 60;

    int remainingseconds = remainder3; //all the remaining seconds that can't fit into a full minute

    // formating the string for return
    String output = String.format("%s day(s), %s hour(s), %s minute(s), %s second(s)", days, hours, minutes, remainingseconds);

    return output;
  }

  /*
   * 
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    
    // moved numbers into variables for ease of access  (in case you want to change the number of seconds)
    int check1 = 60;
    int check2 = 5000;
    int check3 = 100000;
    
    // this code will print out how many seconds are being checked as well as the full time conversion
    System.out.format("%s seconds is equal to: \n", check1);
    System.out.println(timeConversion(check1)); //call and print the function with the number "check1" in line 44
    System.out.println();

    System.out.format("%s seconds is equal to: \n", check2);
    System.out.println(timeConversion(check2)); //call and print the function with the number "check2" in line 45
    System.out.println();

    System.out.format("%s seconds is equal to: \n", check3); //call and print the function with the number "check3" in line 46
    System.out.println(timeConversion(check3));
  }
}