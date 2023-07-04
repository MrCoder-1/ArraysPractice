package com.company;

public class findSingleNumber {

    static int findSingleNumber(int [] array){
        int length = array.length;
        int res = 0;
        for (int i = 0; i < length; i++) {
             res = res ^ array[i];
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println("Hello World");
        int[] array = new int[]{6,2,4,3,4,2,3};
    }
}
