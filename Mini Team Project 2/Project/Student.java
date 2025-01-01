//import Arrays for toString() method
import java.util.Arrays;

//Student class to make Student Objects
public class Student{

  //instance variables to hold information about a Student object
  private String studentName;
  private String DOB;
  private String address;
  private String parentName;
  private String phoneNumber;
  private int studentID;
  private String[] courses;

  //static instance variable to show the next avaliable student ID
  //pretend there are 100000 other students registered before these new students
  private static int nextStudentID = 100001;

  //constructor to create a new Student with provided information
  public Student(String name1, String birthDate, String homeAddress, String name2, String number, String[] arr){
    studentName = name1;
    DOB = birthDate;
    address = homeAddress;
    parentName = name2;
    phoneNumber = number;
    courses = arr;
    studentID = nextStudentID;
    nextStudentID++;
  }

  //override toString method for printing/writing purposes
  public String toString(){
    String r = studentName + "\n" + DOB + "\n" + address + "\n" + parentName + "\n" + phoneNumber + "\n" + studentID + "\n" + Arrays.toString(courses);
    return r;
  }  

  //increase in nextStudent ID static variable by 1
  public static void increaseNextStudentID(){
    nextStudentID++;
  }
  
}