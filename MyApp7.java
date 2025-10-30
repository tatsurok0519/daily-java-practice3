public class MyApp7 {
  private static boolean isDividable(int a, int b) {
    if (b !=0 && a % b == 0) {
      return true;
    } else {
      return false;
    }
    // System.out.println("--- end ---");
  }

  public static void main(String[] args) {
    System.out.println(isDividable(10, 2)); // true
    System.out.println(isDividable(10, 3)); // false
    System.out.println(isDividable(10, 0));
  }
}