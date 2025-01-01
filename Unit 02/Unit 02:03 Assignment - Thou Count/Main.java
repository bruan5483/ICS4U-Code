/**
 * @author Bryant Ruan
 */
 
import java.io.*; 
import java.util.Scanner;

public class Main {

  /**
   * Takes a filename and returns the number of times the word "thou" appears in it.
   * 
   * @param filename
   * @return int
   * @throws java.io.IOException
   */
  public static int thouCount(String filename) throws IOException {  
    //exception handling
    try {
      //set up file variable
      File file = new File(filename);
      //open scanner "sc" for file
      Scanner sc = new Scanner(file);

      //create int "count" to store number of times "thou" occurs
      int count = 0;
            
      //while loop that keeps running as long as there is a word to be read
      while (sc.hasNext()) {     
        //read in the word as String "token" and change it to all uppercase
        String token = sc.next().toUpperCase();

        //checks if the token has the letters "THOU" inside of it
        if (token.contains("THOU")){
          //get the index of where the "T" in "THOU"
          int index = token.indexOf("THOU");
          //checks if "thou" is the entire word by comparing to length of token ("THOU" had 3 more letters after the "T", which is at index 0, so add 4)
          if (token.length()==index+4) {
            count+=1;
            
          } else {
            //set up ascii variable for the character after "THOU"
            int ascii1 = (int) token.charAt(index+4);

            //if the ascii variable shows that the character after letters "THOU" is an uppercase letter, then the token is not a seperate occurance of "THOU"
            if (ascii1>=90 || ascii1<=65) {
              count+=1;
            } 
          }
        }
      } 
      //close scanner sc
      sc.close();
      //return the count of occurences of "thou"
      return count;

    //exception handling
    } catch (IOException exception) {
      System.out.println("Something is wrong with the file.");
      return 0;
    }
  }
    
  /**
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    try {
      System.out.println("The number of times \"thou\" appears in Hamlet is: " 
                         + thouCount("hamlet.txt"));
      System.out.println("The number of times \"thou\" appears in Macbeth is: " 
                        + thouCount("macbeth.txt"));
      System.out.println("The number of times \"thou\" appears in Othello is: " 
                         + thouCount("othello.txt"));
      System.out.println("The number of times \"thou\" appears in Romeo and Juliet is: " 
                         + thouCount("romeoAndJuliet.txt"));
    } catch (IOException exception) {
        System.out.println("Something is wrong with the file.");
      }
  } 
}