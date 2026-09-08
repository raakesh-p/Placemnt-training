import java.util.Scanner;

public class check_palindrome{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    String word;
    System.out.println("Enter a String");
    word = s.nextLine();
    for(int i = 0, j = word.length()-1; i <j; i++,  j--){
      if(word.charAt(i) != word.charAt(j)){
        System.out.println("The string is not a palindrome");
        return;
      }
    }
    System.out.println("The string is a palindrome");
  }

}
