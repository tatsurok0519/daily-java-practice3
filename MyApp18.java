class User {
  String name;
  private int score;

  User(String name, int score) {
    this.name = name;
    this.score = score;
  }

  String getUserString() {
    return this.name + ", " + this.score + ", " + this.getResult();
  }

  // setter
  void setScore(int score) {
    if (score < 0 || score > 100) {
      System.out.println("Invalid score!");
      return;
    }
    this.score = score;
  }

  // getter
  int getScore() {
    return this.score;
  }

  private String getResult() {
    if (this.score >= 80) {
      return "Pass";
    } else {
      return "Fail";
    }
  }
}

public class MyApp18 {
  public static void main(String[] args) {
    User user1 = new User("Taro", 70);
    User user2 = new User("Jiro", 80);

    System.out.println(user1.getUserString());
    System.out.println(user2.getUserString());
    // System.out.println(user1.getResult());
    // System.out.println(user2.getResult());
  }
}
