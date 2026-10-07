// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class array{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        
        int arr[]=new int[n];
        for(int i= 0; i<n;i++){
             arr[i]= sc.nextInt();
            sum += arr[i];
          
        }
        double avg= (double)sum/n;
     System.out.println(sum +" "+avg);
       sc.close();
        
    }
}