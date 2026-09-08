import java.util.Scanner;

public class second_largest_number{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a, b, c;
    System.out.println("Enter three numbers");
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    System.out.println();
    if(a>b && a>c){
      if(b>c)
        System.out.println(b + "  is the second largest number");
      else
        System.out.println(c + " is the second largest number");
    }
    else if(b>a && b>c){
      if(a>c)
        System.out.println(a + " is the second largest number");
      else
        System.out.println(c + " is the second largest number");
    }
    else{
      if(b>a)
        System.out.println(b + " is the second largest number");
      else
        System.out.println(a + " is the second greatest number");
    }
  }
}
