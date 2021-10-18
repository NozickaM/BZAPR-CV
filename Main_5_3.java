package com.company;

import java.util.Arrays;

public class Main {

    public static void setrid(int[] array){
        int len = array.length;
        for (int i = 0; i < len-1; i++)
        {
            int smallestID = i;
            for (int j = i+1; j < len; j++)
                if (array[j] < array[smallestID]){
                    smallestID = j;
                }
            int temp = array[smallestID];
            array[smallestID] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {

        // TODO vytvorte pole o velikosti 10 s nahodnymi cisly 0-10
        // vytvorte metodu setrid, ktera seradi prvky pole vzestupne
        // napr: {5, 6, 7 ,3 } -> {3, 5, 6, 7}
        // muzete vyuzit napr algoritmu bubble sort
        int[] pole = new int[10];
        for (int i = 0; i < 10; i++) {
            pole[i] = (int) (Math.random()*11);

        }
        System.out.println(Arrays.toString(pole));
        setrid(pole);
        System.out.println(Arrays.toString(pole));

    }
}
