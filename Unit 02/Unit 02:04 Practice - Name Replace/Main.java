/**
 * @author Bryant Ruan
 */
 
import java.io.*; 

public class Main {

  /**
   * Replaces all occurrences of *oldName* in *filename* with *newName*.
   *
   * @param filename
   * @param oldName
   * @param newName
   * @return void
   * @throws java.io.IOException when the input file is missing
   */
  public static void replaceName(String filename, String oldName, String newName) throws IOException {
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
      
      //all occurences of names in the plays are either all uppercase or first letter is capitalized

      //make the first letter of both oldNanme and newName uppercase and the rest of the letters lowercase (in case it was not already)
      oldName = oldName.substring(0,1).toUpperCase() + oldName.substring(1).toLowerCase();
      newName = newName.substring(0,1).toUpperCase() + newName.substring(1).toLowerCase();

      //convert the names to all uppercase to check for the second scenario
      String oldNameUpper = oldName.toUpperCase();
      String newNameUpper = newName.toUpperCase();

      //set up file2 "replaceName+filename" 
      File file2 = new File("replacedName"+filename.substring(0,1).toUpperCase() + filename.substring(1));
      //set up FileWriter "writer" for file2
      FileWriter writer = new FileWriter(file2);

      //replacing oldName and oldNameUpper with newName and newNameUpper (respectively) in fileContent
      String newFileContent = fileContent.replaceAll(oldName, newName);
      String newFileContent2 = newFileContent.replaceAll(oldNameUpper, newNameUpper);

      //writing the new text into file2 with newFileContent2       
      writer.write(newFileContent2);
      
      //close FileWriter "writer"
      writer.close();

    //exception handling
    } catch (IOException exception) {
      System.out.println("Something is wrong with one of the files.");
    }
  }
    
  /**
   * 
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    //exception handling
    try {
      //call function replaceName for text files of the play along with the name to be changed
      replaceName("hamlet.txt", "hamlet", "jack");
      replaceName("macbeth.txt", "macbeth", "harry");
      replaceName("othello.txt", "othello", "alex");
      replaceName("romeoAndJuliet.txt", "romeo", "bob");
    
    //exception handling
    } catch (IOException exception) {
      System.out.println("Something is wrong with the file.");
    }
  }  
}