package basics;

public class Student {
  private int age;
  
  private int height;
  
  private String gender;
  
  private String hair;
  
  public Student(int age, int height, String gender, String hair) {
    this.age = age;
    this.height = height;
    this.gender = gender;
    this.hair = hair;
  }
  
  public int getAge() {
    return this.age;
  }
  
  public void setAge(int age) {
    this.age = age;
  }
  
  public int getHeight() {
    return this.height;
  }
  
  public void setHeight(int height) {
    this.height = height;
  }
  
  public String getGender() {
    return this.gender;
  }
  
  public void setGender(String gender) {
    this.gender = gender;
  }
  
  public String getHair() {
    return this.hair;
  }
  
  public void setHair(String hair) {
    this.hair = hair;
  }
  
  public String toString() {
    return "Student [age=" + this.age + ", height=" + this.height + ", gender=" + this.gender + ", hair=" + this.hair + "]";
  }
}

