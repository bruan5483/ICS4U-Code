/**
 * @author Bryant Ruan
 */

//import essentials
import java.io.*; 
import java.util.Scanner;
import java.util.Arrays; 

public class Main {
  // *commonWordsArray* will store the 5000 words in alphabetical order
  public static String[] commonWordsArray = new String[5000];
  
  /**
   * Puts each token from the file into commonWordsArray.
   * 
   * @throws java.io.IOException
   * @return void
   */
  public static void generateCommonWordsArray() throws IOException {
    try {
      File file = new File("words.txt");
      Scanner scanner = new Scanner(file);
      // Keeps track of the indices from 0 to 4999
      int index = 0;

      while (scanner.hasNext()) {
        // Adds each word to *commonWordsArray*
        commonWordsArray[index] = scanner.next();
        index++;
      }
      
      // Closes the scanner for good housekeeping
      scanner.close();
    } catch (IOException exception) {
      System.out.println("Something is wrong with the file.");
    }
  }

  /**
   * Takes a string and indicates whether it is in the
   * array commonWordsArray. 
   * 
   * Words are not case-sensitive (i.e. capitalization doesn't matter).
   * 
   * Uses a binary search algorithm for efficiency.
   * 
   * @param String word 
   * @return boolean
  */
  public static boolean isCommonWord(String word) {
    //convert String word to its lowercase form to satisfy the capitalization condition
    word = word.toLowerCase();
    
    //set up int lowerBound to be the lower limit index for binary searching (start at 0)
    int lowerBound = 0;
    //set up int upperBound to be the upper limit index for binary searching (start at one less than the length of the array for the last index)
    int upperBound = commonWordsArray.length-1;

    //while the upperBound is greater than/equal to the lowerBound, keep looping because if lowerBound is greater than upperBound, the word is not in the array
    while (lowerBound <= upperBound){

      //set up int mid to continuously hold the index that is between the lower and upper limits (which change)
      int mid = (upperBound+lowerBound)/2;
      //compare String word to the word at index mid in commonWordsArray
      int compare = word.compareTo(commonWordsArray[mid]);

      //if the words are exactly the same, return true
      if (compare == 0){
        return true;

      //else if String word comes after the String at index mid, set the lower limit equal to mid+1 (since word does not equal the string at index mid)
      } else if (compare > 0){
        lowerBound = mid + 1;

      //else if String word comes before the String at index mid, set the upper limit equal to mid-1 (since word does not equal the string at index mid)
      } else if (compare < 0){
        upperBound = mid - 1;
      }
    }

    //if the code gets to this point, it will always return false since it failed the checks
    return false;
  }
    
  /**
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //exception handling
    try {
      //generate array
      generateCommonWordsArray();

      //test cases that should all return true
      System.out.println(isCommonWord("classification")); //row 808
      System.out.println(isCommonWord("dna")); //row 1322
      System.out.println(isCommonWord("he")); //row 2043
      System.out.println(isCommonWord("publication")); //row 3568
      System.out.println(isCommonWord("shop")); //row 4071
      System.out.println(isCommonWord("Zealand")); //row 4995 (with capitalization)

      //format by printing empty line
      System.out.println();
      
      //test cases that should all return false
      System.out.println(isCommonWord("10532")); //random number
      System.out.println(isCommonWord("[#.`")); //random characters
      System.out.println(isCommonWord("jonk")); //is this even a word?
      System.out.println(isCommonWord("uoih887")); //random letters and numbers
      System.out.println(isCommonWord("conundrum")); //word that is not in the array

      /*
      //code that checks if method isCommonWord works with all 5000 words in array
      //commented out 
      for (int i = 0; i < commonWordsArray.length; i++){
        if (isCommonWord(commonWordsArray[i])==false){
          System.out.println(commonWordsArray[i]);
        }
      }
       */

    //exception handling
    } catch (IOException exception) {
      System.out.println("Something is wrong with the file.");
    }
  }
}