class User {
  String name;
  int score;
}

public class MyApp13 {
  public static void main(String[] args) {
    User user1 = new User();
    user1.name = "Taro";
    user1.score = 70;
    User user2 = new User();
    user2.name = "Jiro";
    user2.score = 80;

    System.out.println(user1.name);
    System.out.println(user1.score);
    System.out.println(user2.name);
    System.out.println(user2.score);
  }
}