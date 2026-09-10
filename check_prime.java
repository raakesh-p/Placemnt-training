import java.util.Scanner;

class check_prime{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = s.nextInt();
    
    if( num <=1){
      System.out.println("The given number is neither Prime nor Composite number");
      return;
    }
      
    for(int i = 2; i*i < num; i++){
      if(num%i == 0){
        System.out.println("The given number is a Composite number");
        return;
      }
    }
    System.out.println("The given number is a Prime number");
  }
}
