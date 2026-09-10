import java.util.Scanner;
class find_gcd{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    
    while( b != 0){
      int remainder = a % b;
      a = b;
      b = remainder;
    }
    System.out.println("The GCD of two numbers is: " + a);
  }
}
