class Main {
   
  public static String tenOrMore(int number) {
    if (number < 10) {
      return "no";
    } else if (number >= 10) {
      return "yes";
    } else {
      return "error";
    }
  }

  public static int howManyDays(int month) {
    switch (month) {
      case 2: return 28;
      case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
      case 4: case 6: case 9: case 11: return 30;
    }
    return 0;
  }

  public static void main(String[] args) {
    int randomNumber = (int)(Math.random() * 11);
    System.out.println(randomNumber);
    System.out.println(tenOrMore(randomNumber));
    System.out.println();

    int month = (int)(Math.random() * 13);
    System.out.println(month);
    System.out.println(howManyDays(month));
  }
}