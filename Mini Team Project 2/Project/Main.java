/*
 * @author Bryant Ruan
 * @author Daniel Cao
 */

//import essentials
import java.util.Scanner;
import java.io.*;

public class Main {
  
  /*
   * Takes in user input for student information, creates a new Student object, and writes Student information to a file
   * @param command line args
   * @return void
   */
  public static void main(String[] args) {

    //set up scanner
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter your first name:");
    String name = sc.nextLine() + " ";
    System.out.println("Enter your middle name (leave blank if you don't have one):");
    String mid = sc.nextLine();
    if (!mid.equals("")){
      name += (mid + " ");
    }
    System.out.println("Enter your last name:");
    name += sc.nextLine();

    System.out.println("\nEnter your date of birth (mm/dd/yyyy):");
    String date = sc.nextLine();
    while (!ValidDate.validateJavaDate(date)){
      System.out.println("Please enter a valid date of birth (mm/dd/yyyy):");
      date = sc.nextLine();
    }
    
    System.out.println("\nEnter your home address:");
    String address = sc.nextLine();

    System.out.println("\nEnter your Parent's first name:");
    String parentName = sc.nextLine() + " ";
    System.out.println("Enter your Parent's last name:");
    parentName += sc.nextLine();

    System.out.println("\nEnter your phone number (ex. 1234567890):");
    String phone = sc.nextLine();
    
    boolean isValid = false;
    while (!isValid){
      try{
        long x = Long.parseLong(phone);
        if (x>=1000000000 && x<10000000000L){
          isValid = true;
        } else {
          System.out.println("Invalid phone number");
        }
      } catch (NumberFormatException ex){
        System.out.println("Invalid input");
      }

      if (!isValid){
        System.out.println("Enter your phone number (ex. 1234567890):");
        phone = sc.nextLine();
      }  
    }

    isValid = false;

    String[] courses = new String[8];
    
    System.out.println("\nEnter in the course codes for each of your courses this year, one at a time");
    for (int i = 0; i < 8; i++) {
      System.out.println("Enter in the 6 digit course code of course " + (i + 1) + ". For example, \"ENG1DI\":");
      courses[i] = sc.nextLine();
    }

    //write the new student's information to file newStudentStorage.txt
    try{
      File file = new File("newStudentStorage.txt");

      //String to hold any previous contents of newStudentStorage.txt
      String fileContents = "";
      
      //if the file already exists, add all the data to String fileContents
      if (file.exists()){
        int lineCounter = 1;
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
          String line = reader.nextLine();
          fileContents += (line + "\n");
          lineCounter++;
          if (lineCounter%8==7){
            Student.increaseNextStudentID();
          }
        }
        fileContents += "\n";
        reader.close();
      }

      //create a Student object with the given information
      Student s = new Student(name, date, address, parentName, phone, courses);
      
      //write the data to the file
      FileWriter writer = new FileWriter(file);
      writer.write(fileContents);
      writer.write(s.toString() + "\n");
      writer.close();
      
    } catch(IOException exception) {
      System.out.println("Something went wrong.");
    }

    //close scanner sc
    sc.close();
  }
}