class Main {
  public static String stringTimes(String x, int n) {
    String y = "";
    for(int i=1; i<=n; i++) {
      y+=x;
    }
    return y;
  }

  public static void main(String[] args){
    System.out.println(stringTimes("Hi",7));
  }
}