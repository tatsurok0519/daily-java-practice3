class User {
  String name;
  int score;

  User(String name, int score) {
    this.name = name;
    this.score = score;
  }

  String getUserString() {
    return this.name + ", " + this.score;
  }
}

public class MyApp15 {
  public static void main(String[] args) {
    User user1 = new User("Taro", 70);
    User user2 = new User("Jiro", 80);

    System.out.println(user1.getUserString());
    System.out.println(user2.getUserString());
  }
}