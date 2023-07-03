package com.company;

public class MoveZerosToEnd {

    static void moveZeroesToEnd(int [] array){

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                array[counter++] = array[i];
            }
        }
        while(counter < array.length -1){
            array[counter++] = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] array = new int[]{1,3,0,0,4,0,9};
    }
}
