public class MyApp6 {
  private static boolean isDividable(int a,int b) {
    if (a % b == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(isDividable(10, 2));
    System.out.println(isDividable(10, 3));
  }
}