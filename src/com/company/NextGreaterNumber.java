package com.company;

public class NextGreaterNumber {

    static void nextGreaterNumber(int[] arr){
        int min = 0;
        for (int i = arr.length-1; i > 1; i--) {
            if(arr[i] < arr[i-1]){
                min = i;
                break;
            }
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int [] arr = new int[]{2,1,8,7,6,5};
    }
}
