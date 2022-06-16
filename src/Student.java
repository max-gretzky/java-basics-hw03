public class Student {

  private int rating;
  private String name;

  private static int count;
  private static int sumOfRating;

  public Student(String name) {
    this.name = name;
    count++;
  }

  public static double getAvgRating() {
    if (Student.count > 0) {
      return (double) Student.sumOfRating / Student.count;
    }
    return 0;
    /*Student.count < 0.0 ? Student.sumOfRating / Student.count : 0.0;*/
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    sumOfRating += rating;
  }

  public boolean betterStudent() {
    return this.rating > getAvgRating();
  }

  public void changeRating(int rating) {
    sumOfRating -= this.rating;
    setRating(rating);
  }

  public static void removeStudent(Student student) {
    count--;
    sumOfRating -= student.rating;
  }

  @Override
  public String toString() {
    return this.name + " " + this.rating;
  }
}
