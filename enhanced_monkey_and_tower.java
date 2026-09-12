import java.util.Scanner;

class enhanced_monkey_and_tower{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    System.out.print("Enter the height of the tower: ");
    int towerHeight = s.nextInt();
    System.out.print("Enter the climbing distance: ");
    int ascend = s.nextInt();
    System.out.print("Enter the slipping distance: ");
    int descend = s.nextInt();
    
    int net = ascend - descend;
    
    int preFinal = towerHeight - ascend;
    
    int pft = preFinal / net;
    
    System.out.println(2*pft + 1);
  }
}

