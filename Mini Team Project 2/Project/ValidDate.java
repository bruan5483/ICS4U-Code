/*
 * Date validation taken from https://beginnersbook.com/2013/05/java-date-format-validation/
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class ValidDate {

  /*
   * Takes a string containing a date and checks if it is valid
   * @param strDate
   * @return boolean
   */
  public static boolean validateJavaDate(String strDate){
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    sdf.setLenient(false);
    /* Create Date object
     * parse the string into date 
           */
    try{
        Date x = sdf.parse(strDate); 
    }
    //Date format is invalid
    catch (ParseException e)
    {
        System.out.println(strDate+" is an invalid date");
        return false;
    }
    //Return true if date format is valid
    return true;
   }
}