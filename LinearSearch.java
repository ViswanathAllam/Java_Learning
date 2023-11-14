import java.util.Scanner;
public class LinearSearch
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("give the size of array :");
        int s=in.nextInt();
        int[] nums=new int[s];
        //Give input of the s size array elements
        for(int i=0;i<s;i++){
            nums[i]=in.nextInt();
        }
        System.out.println("give the element u want to find out in array :");
        int x=in.nextInt();
        System.out.println(linearSearch(nums,x));
    }
    //search in the array
    static int linearSearch(int[] arr,int x){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
