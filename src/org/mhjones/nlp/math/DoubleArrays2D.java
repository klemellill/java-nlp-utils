package org.mhjones.nlp.math;

import java.util.Arrays;

public class DoubleArrays2D {
    public static double[][] resizeArray(double[][] array, int newPrimaryLength, int secondaryLength, double defaultValue) {
	double[][] newArray = new double[newPrimaryLength][];

	if (newPrimaryLength > array.length) {
	    System.arraycopy(array, 0, newArray, 0, array.length);

	    for (int i = array.length; i < newPrimaryLength; i++) {
		newArray[i] = DoubleArrays.constantArray(secondaryLength, defaultValue);
	    }

	}
	else
	    System.arraycopy(array, 0, newArray, 0, newPrimaryLength);

	return newArray;
    }

    public static double[][] copy(double[][] array) {
	double[][] copy = new double[array.length][];
	for (int i = 0; i < array.length; i++) {
	    array[i] = new double[array[i].length];
	    System.arraycopy(array[i], 0, copy[i], 0, array[i].length);
	}
	return copy;
    }
    
    public static double[][] constantArray(int primaryLength, int secondaryLength, double defaultValue) {
	double[][] ret = new double[primaryLength][];
	
	for (int i = 0; i < secondaryLength; i++)
	    ret[i] = DoubleArrays.constantArray(secondaryLength, defaultValue);

	return ret;
    }

}
