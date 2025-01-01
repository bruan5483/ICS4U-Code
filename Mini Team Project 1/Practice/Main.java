/*
 *@author Bryant Ruan
 */

import java.util.Scanner;
import java.io.*; 
import java.util.Arrays;

class Main {

  public static int areaCalc(double length, double width) {
    double area = length*width;
    return (int) area;
  }
  
  public static String output(String a, String b) {
    String output = a+b;
    return output;
  }
  
  public static int average(int mark1, int mark2, int mark3) {
    int average = (mark1+mark2+mark3)/3;
    return average;
  }

  public static void writeFile(String x) throws IOException {
    try {
      File file = new File("data.txt");
      FileWriter writer = new FileWriter(file);
      
      writer.write(x);
      
      writer.close();
    } catch (IOException exception) {
      System.out.println("Something went wrong.");
    }
  }

  public static String[] readFile(int a) throws IOException {
    String[] strArray = new String[a];
    int i = 0;
    try {
      File file = new File("data.txt");
      Scanner scan = new Scanner(file);
      while (scan.hasNextLine()) {
        String line = scan.nextLine();
        strArray[i] = line;
        i++;
      }
    } catch (IOException exception) {
      System.out.println("Something went wrong.");
    }
    return strArray;
  }
  
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter double input for length: ");
    double length = sc.nextDouble();
    System.out.println("Enter double input for width: ");
    double width = sc.nextDouble();
    System.out.println("The area is: "+ areaCalc(length, width));

    sc.nextLine();
    
    System.out.println("\nEnter first string: ");
    String str1 = sc.nextLine();
    System.out.println("Enter second string: ");
    String str2 = sc.nextLine();
    System.out.println("Output: "+ output(str1, str2));
    
    System.out.println("\nEnter first mark (out of 100): ");
    int mark1 = sc.nextInt();
    System.out.println("Enter second mark (out of 100): ");
    int mark2 = sc.nextInt();
    System.out.println("Enter third mark (out of 100): ");
    int mark3 = sc.nextInt();
    System.out.println("Average: "+ average(mark1, mark2, mark3));
    
    try {
      String data = "";
      int numLine = 1;
      System.out.println("\nContinuously enter data. Enter 'q' to quit:");
      boolean running = true; 
      while (running == true) {
        String x = sc.nextLine();
        if (numLine==1){
          data = x;
        }
        if (x.equals("q")) {
          running = false;
          writeFile(data);
        } else if (!x.equals("")) {
          numLine++;
          data += (System.lineSeparator()+x);
        }
      }
      System.out.println("\nThe data that you entered: "+ Arrays.toString(readFile(numLine)));
      
    } catch (IOException exception) {
      System.out.println("Something is wrong with the file.");
    }
    sc.close();
  }
}