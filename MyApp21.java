class Score {
  private String subject;
  private int score;


  Score(String subject, int score) {
    this.subject = subject;
    this.score = score;
  }
}


class User {
  private String name;
  private Score score;

  User(String name, Score score) {
    this.name = name;
    this.score = score;
  }
}

public class MyApp21 {
  public static void main(String[] args) {
    User user1 = new User("Taro", new Score("Math", 70));
    User user2 = new User("Jiro", new Score("English", 80));
  }
}