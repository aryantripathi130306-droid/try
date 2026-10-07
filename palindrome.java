//two pointer approach
import java.util.*;
public class palindrome {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int start = 0;
    int end = str.length()-1;
    while(start<end){
        if(str.charAt(start) != str.charAt(end)){
            System.out.println("Not a palindrome");
            break;
        }
        start++;
        end--;
    }
    System.out.println("It is a palindrome");
  }  
}
