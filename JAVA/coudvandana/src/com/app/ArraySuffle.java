package com.app;

import java.util.Random;

public class ArraySuffle {
	public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(originalArray);

        // Print the shuffled array
        for (int value : originalArray) {
            System.out.print(value + " ");
        }
    }

    // Durstenfeld Shuffle algorithm
    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int randomIndex = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}
