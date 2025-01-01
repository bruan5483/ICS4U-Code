/*
 * @author Bryant Ruan 
 */

//import io essentials
import java.io.*; 

class Main {

  /*
   * reverses all the text in *filename* and writes it in a file that is named as the reversed filename
   *
   * @param String filename
   * @return void
   * @throws java.io.IOException when the input file is missing
   */
  public static void reverseFile(String filename) throws IOException {
    //set up string "fileContent" as an empty string to store the contents of a file
    String fileContent = "";

    //exception handling
    try {
      //set up "file" object
      File file = new File(filename);

      //set up BufferedReader "reader" for "file"
      BufferedReader reader = new BufferedReader(new FileReader(file));

      //set up the String "line" for the first line of the file that "reader" is reading
      String line = reader.readLine();

      //while loop that continuously adds the next line in the file to the String "filecontent" (seperated with a system line seperator) as long as there a line to be read
      while (line != null) {
        fileContent = fileContent + line + System.lineSeparator();
        line = reader.readLine();
      } 

      //close BufferedReader "reader"
      reader.close();

      //set up empty String "newFileContent" where the reversed text will be stored
      String newFileContent ="";
      //intialize char "ch" for use in the following for loop
      char ch;

      //for loop that extracts each character in the string "fileContent" and adds each new character before the exisiting characters
      for (int i=0; i<fileContent.length(); i++)
      {
        ch = fileContent.charAt(i); 
        newFileContent = ch + newFileContent; 
      }

      //set up String "filename2", which is just filename with the ".txt" removed
      String filename2 = filename.replace(".txt", "");
      //set up empty String "nameReverse" where the reversed name will be stored
      String nameReverse = "";

      //for loop that extracts each character in the string "filename2" and adds each new character before the exisiting characters
      for (int i=0; i<filename2.length(); i++)
      {
        ch = filename2.charAt(i);
        nameReverse = ch + nameReverse; 
      }

      //set up new txt file with the reversed name of "filename"
      File file2 = new File(nameReverse+".txt");

      //initialze FileWriter "writer" for "file2"
      FileWriter writer = new FileWriter(file2);

      //write the reversed text to file2
      writer.write(newFileContent);

      //close FileWriter "writer"
      writer.close(); 

      //exception handling
      } catch (IOException exception) {
      System.out.println("Something is wrong with one of the files.");
    }
  }

  /*
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
  //exception handling
  try {
    //call function "reverseFile" for text case "romeoAndJuliet.txt"
    reverseFile("romeoAndJuliet.txt");

  //exception handling
  } catch (IOException exception) {
    System.out.println("Something is wrong with the file.");
    }
  }
}