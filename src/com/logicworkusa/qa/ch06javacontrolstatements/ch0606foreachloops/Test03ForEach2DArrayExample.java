package com.logicworkusa.qa.ch06javacontrolstatements.ch0606foreachloops;
public class Test03ForEach2DArrayExample {

    public static void main(String[] args) {
        // Using for-each loop to iterate through a 2D array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
