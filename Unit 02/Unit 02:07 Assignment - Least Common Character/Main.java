/**
 *
 * @author Bryant Ruan
 */
import java.util.Arrays;

public class Main {
  
  /**
   * This method takes a string and returns the least common character in it.
   *
   * If there is a tie, it returns the one at the highest index.
   *
   * If the string is empty, it returns the character with ASCII value 0.
   *
   * @param String s 
   * @return char minChar
   */
  public static char leastCommonChar(String s) {

    //declare char minChar so that it can be used in both the "if" and "else" portions of the code (will be the return of the method)
    char minChar;

    //if statement to make sure that the string is not empty
    if (s.length() > 1){
      //create a char array with all the characters in the string s 
      char str[] = new char[s.length()];
      //fill the array
      for (int i = 0; i < s.length(); i++){
        str[i] = s.charAt(i);
      }

      //create an int array to hold the number of occurences of the corresponding char in the char array (arrays are the same length)
      int freq[] = new int[s.length()];

      //for loop to go through each of the items in the char array "str"
      for(int i = 0; i < str.length; i++){
        //set each occurence to 1 as an inital value (they definitely exist)
        freq[i] = 1;    
        //for loop to go through the char array "str" and compare each char at index "j" to the item at index "i"
        for(int j = 0; j < str.length; j++) {    
          //if the chars at indexes i and j are the same while i!=j, add one to the occurence count in the int array "freq"
          if(str[i] == str[j] && i != j) {    
            freq[i] += 1; 
          }
        }
      }

      //intialize char minChar (intialized earlier) to be the first item in the array "str"
      minChar = str[0];
      //start off defining int min to be the first item in the array "freq"
      int min = freq[0];
      //for loop to go through the int array "freq"
      for(int i = 0; i < freq.length; i++) {
        //if min is less than or equal to the item at index i, it is the new min (the equal to part is so that if there is a tie, the return will be the item at a highest index)
        //sets minChar to the corresponding char with the least occurences in the array "str"
        if(min >= freq[i]){
          min = freq[i];
          minChar = str[i]; 
        }
      }

    //if the string is empty, minChar is initalized to be equal to the char with ASCII value 0
    } else {
      minChar = (char) 0;
    }

    //return char minChar
    return minChar;
  }
      
  /**
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    /*
     * Test Cases (used a random sentence generator lol)
     */

  //define 12 unique strings
  String empty = "";
  String test0 = "A test case with a period.";
  String test1 = "At that moment he wasn't listening to music, he was living an experience";
  String test2 = "He had decided to accept his fate of accepting his fate";
  String test3 = "It was a slippery slope and he was willing to slide all the way to the deepest depths";
  String test4 = "Before he moved to the inner city, he had always believed that security complexes were psychological";
  String test5 = "The hummingbird's wings blurred while it eagerly sipped the sugar water from the feeder";
  String test6 = "Garlic ice-cream was her favorite";
  String test7 = "A quiet house is nice until you are ordered to stay in it for months";
  String test8 = "He turned in the research paper on Friday; otherwise, he would have not passed the class";
  String test9 = "I met an interesting turtle while the song on the radio blasted away";
  String test10 = "All they could see was the blue water surrounding their sailboat";

  //call the function "leastCommonChar" and print the output (nicely formatted)
  System.out.println("Least common char: "+ leastCommonChar(empty));
  System.out.println("Least common char: "+ leastCommonChar(test0));  
  System.out.println("Least common char: "+ leastCommonChar(test1));
  System.out.println("Least common char: "+ leastCommonChar(test2));
  System.out.println("Least common char: "+ leastCommonChar(test3));
  System.out.println("Least common char: "+ leastCommonChar(test4));
  System.out.println("Least common char: "+ leastCommonChar(test5));
  System.out.println("Least common char: "+ leastCommonChar(test6));
  System.out.println("Least common char: "+ leastCommonChar(test7));
  System.out.println("Least common char: "+ leastCommonChar(test8));
  System.out.println("Least common char: "+ leastCommonChar(test9));
  System.out.println("Least common char: "+ leastCommonChar(test10));
  }
}