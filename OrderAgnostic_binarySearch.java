package com.binarysearch;

import java.util.Scanner;

public class OrderAgnosticbinarySearch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={-19,-17,-10,-7,1,3,4,5,6,9,20,22,25,29,30,47,98,108};
        int[] desArr={108,98,88,82,9,8,5,3,2,-2,-4,-90,-109,-801};
        System.out.println("Enter the target value :");
        int target=in.nextInt();
        System.out.println("index of the target value in array is: "+binarySearch( desArr,target));
    }

    static boolean isAsc(int[] arr){
        if(arr[0]<arr[arr.length-1]){
            return true;
        }
        else return false;
    }

    static int binarySearch(int[] arr,int target){
    int start=0;
    int end=arr.length-1;
    while(start<=end) {
        int mid = start + (end - start) / 2;
        if (target < arr[mid]) {
            if(isAsc(arr)) {
                end = mid - 1;
            }
            else
            {
                start=mid+1;
            }
        } else if (target > arr[mid]) {
            if(isAsc(arr)) {
                start = mid + 1;
            }
            else{
                end=mid-1;
            }
        } else {
            return mid;
        }
    }
    return -1;

    }

}