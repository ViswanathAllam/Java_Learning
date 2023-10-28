import java.util.Scanner;

public class IsPrime_OptimizedSoln {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter number to check for prime :");
        int num= in.nextInt();
        System.out.println("whether the"+" "+num+" "+"is prime or not :"+isPrime(num));

    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
