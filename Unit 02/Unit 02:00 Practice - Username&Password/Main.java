/**
@author Bryant Ruan
*/

import java.util.Scanner;  // Import the Scanner class

class Main {
  /**
  This program takes a string password input and returns an ecrypted version in the form: ****** (one star for each digit)

  @param String password
  @return String encrypted password 
  */
  public static String encrypt(String password){
    //create empty String "str"
    String str = "";
    //get length of password in characters
    int length = password.length(); 
    //from 1 to the length of the password, for each integer append a star to the end of "str"
    for (int i = 1; i <= length; i++) {
      str += "*";
    }

    //return "str"
    return str;
  }

  /**
  Main

  @param command line args
  @return void
  */
  public static void main(String[] args) {

    //initalize the scanner "sc"
    Scanner sc = new Scanner(System.in);
    //ask for username input, takes input and sets it as the String "username"
    System.out.print("Username: ");  
    String username = sc.next(); 
    //ask for password input, takes input and sets it as the String "password"
    System.out.print("Password: ");  
    String password = sc.next(); 

    //print out the username, pring out the encrypted password (in *'s)
    System.out.println("\nUsername: " + username);
    System.out.println("Password: " + encrypt(password));

    //close the scanner "sc"
    sc.close();
  }
}