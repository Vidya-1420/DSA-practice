import java.util.Scanner;

class Main {
    static int even  (int [] ar){
        int sum=0;
        for(int i=ar.length-1;i>=0;i-=2){
            
                sum+=ar[i];           
       
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();
         int []ar=  new int [n];
         for(int i=0;i<ar.length;i++){
            ar[i]= scanner.nextInt();
         }
         System.out.print(even(ar));
         }
}
