package basics;

public class Date {
  private int day;
  
  private int month;
  
  private int year;
  
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
  
  public Date(Date dt) {
    this.day = dt.getDay();
    this.month = dt.getMonth();
    this.year = dt.getYear();
  }
  
  public int getDay() {
    return this.day;
  }
  
  public void setDay(int dd) {
    this.day = dd;
  }
  
  public int getMonth() {
    return this.month;
  }
  
  public void setMonth(int month) {
    this.month = month;
  }
  
  public int getYear() {
    return this.year;
  }
  
  public void setYear(int year) {
    this.year = year;
  }
  
  public boolean equals(Date dt) {
    return (this.day == dt.getDay() && this.month == dt.getMonth() && this.year == dt.getYear());
  }
  
  public boolean isAfter(Date dt) {
    if (this.year > dt.getYear())
      return true;
    if (this.year < dt.getYear())
      return false;
    if (this.month > dt.getMonth())
      return true;
    if (this.month < dt.getMonth())
      return false;
    return this.day > dt.getDay();
  }
  
  public boolean isBefore(Date dt) {
    return (!equals(dt) && !isAfter(dt));
  }
  
  public String toString() {
    return "day:" + this.day + " month:" + this.month + " year:" + this.year;
  }
}
