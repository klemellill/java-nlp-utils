package org.mhjones.nlp.math;

import java.util.Arrays;

public class IntegerArrays2D {
    public static int[][] resizeArray(int[][] array, int newPrimaryLength, int secondarySize, int defaultValue) {
	int[][] newArray = new int[newPrimaryLength][];

	if (newPrimaryLength > array.length) {
	    System.arraycopy(array, 0, newArray, 0, array.length);

	    for (int i = array.length; i < newPrimaryLength; i++) {
		newArray[i] = IntegerArrays.constantArray(secondarySize, defaultValue);
	    }

	}
	else
	    System.arraycopy(array, 0, newArray, 0, newPrimaryLength);

	return newArray;
    }

    public static int[][] copy(int[][] array) {
	int[][] copy = new int[array.length][];
	for (int i = 0; i < array.length; i++) {
	    array[i] = new int[array[i].length];
	    System.arraycopy(array[i], 0, copy[i], 0, array[i].length);
	}
	return copy;
    }

    public static int[][] constantArray(int primarySize, int secondarySize, int defaultValue) {
	int[][] ret = new int[primarySize][];
	
	for (int i = 0; i < secondarySize; i++)
	    ret[i] = IntegerArrays.constantArray(secondarySize, defaultValue);

	return ret;
    }

}
