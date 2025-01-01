/**
 * @author Bryant Ruan
 */
 
import java.io.*; 
import java.util.Scanner;

public class Main {

  /**
   * Takes a filename and returns the number of alphabet characters in it.
   * 
   * @param filename 
   * @return int
   * @throws java.io.IOException
   */
  public static int letterCount(String filename) throws IOException {  
    //exception handling  
    try {
      //set up file variable
      File file = new File(filename);
      //open scanner "sc" for file
      Scanner sc = new Scanner(file);
      //create int lettercount to store number of letters in a file 
      int lettercount = 0;

      //while loop that keeps running as long as there is a word to be read
      while (sc.hasNext()){
        //read in the word as String "x" and change it to all lowercase
        String x = sc.next().toLowerCase();
        //for loop runs every integer from 0 to the length of the word that is being read, adding 1 every loop
        for (int i = 0; i < x.length(); i++) {
          //get the ascii value of the character at position "i" 
          int ascii = (int) x.charAt(i);
          //if the ascii value matches one of the lowercase letters, add 1 to the int lettercount
          if (ascii >= 97 && ascii <= 122) {
            lettercount += 1;
          } 
        }
      }

      //close the scanner
      sc.close();
      //return the number of letters in the file
      return lettercount;

    //exception handling
    } catch (IOException exception) {
      System.out.println("Something is wrong with the file.");
      return 0;

    }
  }
    
  /**
   * Main
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //exception handling
    try {
      //print the lettercounts for hamlet, macbeth, othello, romeo and juliet
      System.out.println("The number of letters in Hamlet is: " 
                         + letterCount("hamlet.txt"));
      System.out.println("The number of letters in Macbeth is: " 
                         + letterCount("macbeth.txt"));
      System.out.println("The number of letters in Othello is: " 
                         + letterCount("othello.txt"));
      System.out.println("The number of letters in Romeo and Juliet is: " 
                         + letterCount("romeoAndJuliet.txt"));
    } catch (IOException exception) {
        System.out.println("Something is wrong with the file.");
    }
  }
}
