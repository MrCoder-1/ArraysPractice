package com.company;

public class MoveZerosToEnd {

    static void moveZeroesToEnd(int [] array){

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                array[counter++] = array[i];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] array = new int[]{1,3,0,0,4,0,9};
    }
}
