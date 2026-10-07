import java.util.*;
public class revword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String rev = "";
        for(int i=words.length-1; i>=0; i--){
            rev += words[i] + " ";
        }
        System.out.println(rev.trim());
    }
}
