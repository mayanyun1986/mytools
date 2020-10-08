package com.myy.random;

public class Shuffle {

    public static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            int j = new Random().rand(arr.length - i) + i;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 21, 23, 52, 55, 66, 88};
        shuffle(arr);
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
    }
}
