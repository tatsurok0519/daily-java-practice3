class User {
  String name;
  int score;

  User(String name, int score) {
    this.name = name;
    this.score = score;
  }
}

public class MyApp14 {
  public static void main(String[] args) {
    User user1 = new User("Taro", 70);
    // user1.name = "Taro";
    // user1.score = 70;
    User user2 = new User("Jiro", 80);
    // user2.name = "Jiro";
    // user2.score = 80;

    System.out.println(user1.name);
    System.out.println(user1.score);
    System.out.println(user2.name);
    System.out.println(user2.score);
  }
}