/*
 *@author Bryant Ruan
 */

import java.io.*; 
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;

//Write a program that asks the user a series of questions and stores the questions and their answers neatly in a file. 
class Main {

  private static HashMap<String, String> questionsAnswers;

  public static void addQuestions(){
    questionsAnswers = new HashMap<String, String>();
    questionsAnswers.put("What is the atomic number for lithium? \na: 3, b: 16, c: 15, d: 14", "a");
    questionsAnswers.put("How many bones are in each human foot? \na: 43, b: 67, c: 26, d: 106", "c");
    questionsAnswers.put("Alliumphobia is a fear of garlic (t/f)?", "t");
    questionsAnswers.put("'A' is the most common letter used in the English language (t/f)?", "f");
    questionsAnswers.put("Thomas Edison discovered gravity (t/f)?", "f");
  }
  
  public static boolean answerIsCorrect(String question, String answer){
    if (questionsAnswers.containsKey(question)){
      if (questionsAnswers.get(question).equals(answer)){
        return true;
      }  
    }
    return false;
  }
  
  public static void main(String[] args) {
    addQuestions();

    int counter = 1;
    
    try{
      Scanner sc = new Scanner(System.in);
      
      File file = new File("q1.txt");
      FileWriter writer = new FileWriter(file);
      
      Set<String> keys = questionsAnswers.keySet();
      
      for (String key : keys){
        System.out.println("Q" + counter + ": " + key);
        writer.write("Q" + counter + ": " + key + "\n");
        String answer = sc.nextLine().toLowerCase();
        writer.write(answer + "\n");
        writer.write("" + answerIsCorrect(key, answer) + "\n" + "\n");
        counter++;
        System.out.println();
      }

      writer.close();
      sc.close();
      
    } catch (IOException exeption){
      System.out.println("Something went wrong.");
    }
  }
}