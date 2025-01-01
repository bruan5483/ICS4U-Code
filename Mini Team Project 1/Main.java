/*
 *
 *@owner/author Bryant Ruan
 *@author Jane He
 */

//import Scanner class
import java.util.Scanner;

class Main {
  
  /**
    Prompts a quiz, informs if each input is correct/incorrect and gives a score at the end
  
    @param command line args
    @return void
    */
  public static void main(String[] args) {

    //initialize int that holds score
    int score = 0;
    
    //set up Scanner object scan for user input
    Scanner scan = new Scanner(System.in);

    //declare String line
    String line;

    //print question 1
    System.out.println("Q1: What is the atomic number for lithium? \na: 17, b: 16, c: 15, d: 14");

    //set String line to the user input (set to lowercase)
    line = scan.nextLine().toLowerCase();

    //if the input is equal to the correct answer, add 1 to the score and print "Correct"
    if (line.equals("a")){
      score += 1;
      System.out.println("Correct");
    } 
    // else if valid user input, but wrong answer, print incorrect statement with correct answer
    else if (line.matches("[bcd]")){
      System.out.println("Incorrect; The correct answer is: a");

    // print error statement for invalid user input
    } else {
      System.out.println("Invalid input");
    }

    //print question 2
    System.out.println("\nQ2: How many bones are in each human foot? \na: 43, b: 67, c: 28, d: 106");

    //set String line to the user input (set to lowercase)
    line = scan.nextLine().toLowerCase();

    //if the input is equal to the correct answer, add 1 to the score and print "Correct"
    if (line.equals("c")){
      score += 1;
      System.out.println("Correct");
    } 
    // else if valid user input, but wrong answer, print incorrect statement with correct answer
    else if (line.matches("[abd]")){
      System.out.println("Incorrect; The correct answer is: c");

    // print error statement for invalid user input
    } else {
      System.out.println("Invalid input");
    }

    //print question 3
    System.out.println("\nQ3: Alliumphobia is a fear of garlic (T/F)?");

    //set String line to the user input (set to uppercase)
    line = scan.nextLine().toUpperCase();
    
    // if answer is correct, add to score and print "Correct"
    if (line.equals("T")){
      score += 1;
      System.out.println("Correct");

    // else if valid user input, but wrong answer, print incorrect statement with correct answer
    } else if (line.equals("F")) {  
      System.out.println("Incorrect; The correct answer is: T");

    //else invalid user input, print error statement
    } else {
      System.out.println("Invalid input");
    }

    //print question 4
    System.out.println("\nQ4: 'A' is the most common letter used in the English language (T/F)?");

    //set String line to the user input (set to uppercase)
    line = scan.nextLine().toUpperCase();
    
    // if answer is correct, add to score and print "Correct"
    if (line.equals("F")){
      score += 1;
      System.out.println("Correct");

    // else if valid user input, but wrong answer, print incorrect statement with correct answer
    } else if (line.equals("T")) {  
      System.out.println("Incorrect; The correct answer is: F");

    //else invalid user input, print error statement
    } else {
      System.out.println("Invalid input");
    }

    //print question 5
    System.out.println("\nQ5: Thomas Edison discovered gravity (T/F)?");

    //set String line to the user input (set to uppercase)
    line = scan.nextLine().toUpperCase();
    
    // if answer is correct, add to score and print "Correct"
    if (line.equals("F")){
      score += 1;
      System.out.println("Correct");

    // else if valid user input, but wrong answer, print incorrect statement with correct answer
    } else if (line.equals("T")) {  
      System.out.println("Incorrect; The correct answer is: F");

    //else invalid user input, print error statement
    } else {
      System.out.println("Invalid input");
    }
    
    //print the user's final score (nicely formatted)
    System.out.println("\nYour score was: " + score + "/5");

    //close Scanner scan
    scan.close();
  }
}