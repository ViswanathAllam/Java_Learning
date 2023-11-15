package com.binarysearch;

import java.util.Scanner;

public class ceil_floor_array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //let's assume given array is in ascending order.
        int [] arr= {12,13,14,15,17,18,21,24,26,90,98,108};
        System.out.print("Give the target element that requires ceiling value in array :");
        int ceilTarget=in.nextInt();
        System.out.print("Give the target element that requires flooring value in array :");
        int floorTarget=in.nextInt();
        System.out.println("ceiling value for given target value "+ceilTarget+" is "+arr[ceilingValue(arr,ceilTarget)]);
        System.out.println("ceiling value for given target value "+floorTarget+" is "+arr[floorValue(arr,floorTarget)]);
    }

    //Ceiling value of target number in a given array is the smallest number in array that is greater than target value.
    // example: arr={12,13,14,15,17,18,21} , target = 16, 16 is not in array so it will return it's ceil value 17.
    //output : 17, it is the element that is greater than 16 and smallest among the elements that are greater than 16 with in the array.
    static int ceilingValue(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        // start=end+1;
        return start;
    }

    //Flooring value of target number in a given array is the smallest number in array that is greater than target value.
    // example: arr={12,13,14,15,17,18,21} , target = 16, 16 is not in array so it will return it's floor value 15.
    //output : 17, it is the element that is less than 16 and highest among the elements that are lesser than 16 with in the array.
    static int floorValue(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}