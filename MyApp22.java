class Score {
  private String subject;
  private int score;

  Score(String subject, int score) {
    this.subject = subject;
    this.score = score;
  }

  String getScoreString() {
    return this.subject + ", " + this.score;
  }
}

class User {
  private String name;
  private Score score;

  User(String name, Score score) {
    this.name = name;
    this.score = score;
  }

  String getUserString() {
    return this.name + ", " + this.score.getScoreString();
  }
}

public class MyApp22 {
  public static void main(String[] args) {
    User user1 = new User("Taro", new Score("Math", 70));
    User user2 = new User("Jiro", new Score("English", 80));

    System.out.println(user1.getUserString());
    System.out.println(user2.getUserString());
  }
}