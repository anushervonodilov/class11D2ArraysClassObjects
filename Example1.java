package com.class11;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {

        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}

        };

        for (int[] nums : matrix) {

            for (int number : nums) {
                System.out.print(number + " ");
            }
            System.out.println();
        }


    }
}
