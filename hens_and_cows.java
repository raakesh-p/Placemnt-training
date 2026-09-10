/* in a forest some number of hens and cows are living together, 
if total number of legs from the category is given, and total
number of heads is given. Then find number of hens and cows seperately.
If unable to get proper solution, print 'Invalid Input'.
*/

import java.util.Scanner;

class hens_and_cows{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of heads: ");
    int heads = s.nextInt();
    System.out.println("Enter the number of legs: ");
    int legs = s.nextInt();
    int hens;
    int cows;
    
    for(int i = 0; i< heads; i++){
      cows = i;
      hens = heads - cows;
      if( 4*cows + 2*hens == legs){
        System.out.println("Number of cows: " + cows + "\nNumber of hens: " + hens);
        return;
      }
    }
    System.out.println("Invalid Input");
  }
}       
