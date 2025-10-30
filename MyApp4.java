public class MyApp4 {
  private static int sum(int a, int b) {
    return a + b;
  }

  private static void showSum(int a, int b) {
    System.out.println(a + b);
  }

  public static void main(String[] args) {
    System.out.println(sum(3, 7)* 4);
    showSum(3, 7);
  }
}