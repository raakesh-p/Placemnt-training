import java.util.Scanner;

class block_line_star{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int blocks = s.nextInt();
    int lines = s.nextInt();
    int stars = s.nextInt();
    int totalStars = 0;
    int currStars;
    for(int i = 0; i < blocks; i++){
      for(int j = 1 ; j<= lines-i; j++){
        for(int k = 0; k<stars; k++){
          System.out.print("*");
        }
        System.out.println();
      }
      currStars = (lines-i)*stars;
      totalStars += currStars;
      System.out.println("Stars: " + currStars);
      System.out.println("-----------------------");
    }
    System.out.println("Total Stars: " + totalStars);
  }
}
