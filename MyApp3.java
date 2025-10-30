public class MyApp3 {
  private static int triple(int num) { // 仮引数
    return num * 3;
  }

  public static void main(String[] args) {
    System.out.println(triple(10)); // 実引数
    System.out.println(triple(4) * 3); // 実引数
  }
}