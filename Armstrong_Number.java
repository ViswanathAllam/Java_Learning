import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        for(int i=100;i<=999;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }

    }
    //Print all 3 digit armstrong numbers
    static boolean isArmstrong(int num) {
        int ans=0;
        int original=num;
        while(num>0){
            int rem=num%10;
            num=num/10;
            ans=ans+rem*rem*rem;
        }
        return ans==original;
    }
}
