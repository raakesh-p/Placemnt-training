import java.util.Scanner;

class check_leap_year{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a year");
    int year = s.nextInt();
    if( year%400 == 0 || (year%4 == 0 && year%100 != 0))
      System.out.println("The year " + year + " is a leap year");
    else
      System.out.println("The year " + year + " is not a leap year");
  }
}
