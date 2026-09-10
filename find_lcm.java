import java.util.Scanner;

class find_lcm{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a = s.nextInt();
    int b = s.nextInt();
    int c = Math.max(a,b);
    int d = Math.min(a,b);
    int step = c;
    while(true){
      if(c%d == 0)
        break;
      else
        c = c + step;
    }
    System.out.println("LCM of " + a + " and " + b + " is " + c);
  }
 }
