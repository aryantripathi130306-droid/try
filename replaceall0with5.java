public class replaceall0with5 {
    public static void main(String [] args){
        int n = 1004;
        while(n!=0){
            int rem = n%10;
            if(rem==0){
                System.out.print(5);
            } else {
                System.out.print(rem);
            }
            n = n/10;
        }
    }
}
