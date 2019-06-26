package com.kobekun;

public class ArrayPrelude {

    //数组最好应用于 索引有寓意的场景，并不是所有有寓意的所引都使用于数组
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;

        int[] scores = new int[]{100,78,98};
        for (int i = 0; i < scores.length; i++){
            System.out.println(scores[i]);
        }

        for(int score:scores){
            System.out.println(score);
        }

        scores[0] = 95;
        for(int score:scores){
            System.out.println(score);
        }
    }
}
