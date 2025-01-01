/**
 *
 * @author Bryant Ruan
 */

//import HashSet
import java.util.HashSet;

public class Main {
    
  /**
   * Takes two hashsets of integers and determines whether 
   * they have any items in common by checking whether 
   * |setA| + |setB| = |setA ∪ setB|.
   * https://replit.com/@triarch12
   * @param setA
   * @param setB
   * @return true if setA and setB have at least item in common; false otherwise
   */
  public static boolean haveCommonItems(HashSet<Integer> setA, HashSet<Integer> setB) {

    //get the sum of the sizes of the two sets
    int sizeBoth = setA.size() + setB.size();

    //make a new set to hold the merged sets
    HashSet<Integer> setAUB = new HashSet();

    //add setA to the newly created setAUB
    setAUB.addAll(setA);
    //add setB to setAUB
    setAUB.addAll(setB);

    //check if the sizes of the sets are equal (|setA| + |setB| = |setA ∪ setB|)
    //returns true if they are not equal (there is at least one common item)
    if (sizeBoth != setAUB.size()){
      return true;
    }

    //return false otherwise
    return false;
  }
      
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //testcases
    UnitTests.runTests();
  }    
}
