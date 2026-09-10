import java.util.Scanner;

class print_primes{
  public static void main(String[] args){
    boolean isprime = true;
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter a number for range: ");
    int num = s.nextInt();
    for(int i = 2; i<=num; i++){
      isprime = true;
      for(int j = 2; j*j <=i; j++){
        if(i%j == 0){
          isprime = false;
          break;
        }
      }
      if(isprime)
      System.out.println(i);
    }
  }
}     
