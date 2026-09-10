/*There is a tower of height x meters, at the bottom of the tower stands a monkey.
The monkey has to reach the top of the tower from bottom.in the 1st minute the monkey 
can climb y meters, and in the 2nd minute the monkey will slip by z meters. 
What is the time the monkey reach the top*/

import java.util.Scanner;

class monkey_and_tower{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the height of the tower: ");
    int x = s.nextInt();
    System.out.print("Enter the climbing distance distance of the monkey: ");
    int y = s.nextInt();
    System.out.print("Enter the slipping distance of the monkey: ");
    int z = s.nextInt();
    int currHeight= 0;
    int currMin = 0;
    while(currHeight < x){
      currMin++;
      if(currMin % 2 == 0)
      currHeight -= z;
      else
      currHeight += y;
    }
    System.out.println("\nTime taken for the monkey to reach the top: "+ currMin + " mins");
  }
}
