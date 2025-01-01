/**
 * @author Bryant Ruan
 */

public class Main {
  
  /**
   * Converts a temperature from Celsius to Fahrenheit.
   *
   * @param t
   * @return double f
   */
  public static double celsiusToFahrenheit(double t) {
    //set up double f with proper calculations to convert double t from celsius to fahrenheit
    double f = (t*9/5)+32;
    //return double f
    return f;
  }

  /**
   * Converts a temperature from Fahrenheit to Celsius.
   *
   * @param t
   * @return double c
   */
  public static double fahrenheitToCelsius(double t) {
    //set up double c with proper calculations to convert double t from fahrenheit to celsius
    double c = (t-32)*5/9;
    //return double c
    return c;
  }

  /**
   * 
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    //print out the converted temperatures, properly formatted (rounded to 2 decimal places)
    System.out.format("Temperature in Fahrenheit is: %.2f", celsiusToFahrenheit(22.6));
    System.out.format("\nTemperature in Fahrenheit is: %.2f", celsiusToFahrenheit(0));
    System.out.format("\nTemperature in Celsius is: %.2f", fahrenheitToCelsius(140.9));
    System.out.format("\nTemperature in Celsius is: %.2f", fahrenheitToCelsius(33.2));
  }
}