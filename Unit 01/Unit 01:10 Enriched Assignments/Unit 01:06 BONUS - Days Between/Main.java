/**
 * @author Bryant Ruan
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
  
  /**
   * Determines the number of days between two dates.
   * The dates are in the format yyyy-mm-dd.
   *
   * @param String date1
   * @param String date2
   * @return long dayDifference
   */
  public static long daysBetween(String date1, String date2) {

    //using parse() method of the LocalDate class on strings "date1" and "date2", returning them as LocalDate objects 
    LocalDate dateOne = LocalDate.parse(date1);
	  LocalDate dateTwo = LocalDate.parse(date2);
		
	  //calculating the number of days between "dateOne" and "dateTwo" using ChronoUnit
	  long dayDifference = ChronoUnit.DAYS.between(dateOne, dateTwo);
		
	  //returning the long dayDifference
	  return dayDifference;
  }

  /**
   * 
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    //tests
    System.out.println("Difference of days: " + daysBetween("2022-01-20", "2022-03-02"));
    System.out.println("Difference of days: " + daysBetween("2012-12-17", "2016-01-31"));
    System.out.println("Difference of days: " + daysBetween("1970-07-28", "1980-09-13"));
  }
}
