class Main {
  
  /*
  main

  @param command line args
  @author Bryant Ruan
  @return void
  */
  public static void main(String[] args) {
    int num1 = 7;
    int num2 = 10;
    int num3 = 19;
    int num4 = 21;
    int num5 = 25;

    int sum1 = addThreeNums(num1, num2, num3);
    System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + sum1);

    int product1 = multiplyTwoNums(num4, num5);
    System.out.println(num4 + "x" + num5 + "=" + product1);
  }
  
  /*
  this function adds 3 numbers
  @param int a,b,c
  @return int sum
  */
  public static int addThreeNums(int a, int b, int c) {
    // adding three numbers a, b, and c together and returning the sum
    int sum = a + b + c;
    return sum;
  }

  /*
  This function multiplies 2 numbers
  @param int a,b
  @return int product
  */
  public static int multiplyTwoNums(int a, int b) {
    int product = a*b;
    return product;

  }

}