class User {
  String name;
  int score;
  private static int count = 0;

  User(String name, int score) {
    this.name = name;
    this.score = score;
    User.count++;
  }

  static int getUserCount() {
    return User.count;
  }
}

public class MyApp20 {
  public static void main(String[] args) {
    User user1 = new User("Taro", 70);
    User user2 = new User("Jiro", 80);

    // System.out.println(User.count);
    System.out.println(User.getUserCount());
  }
}