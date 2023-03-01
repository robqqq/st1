package ru.itmo.se.st;

import java.util.Arrays;

public class Task2 {
	private static int[] merge(int[] a, int[] b) {
		int[] arr = new int[a.length + b.length];
		
		int ai = 0, bi = 0;
		
		for (int i = 0; i < arr.length; ++i) {
			if (ai < a.length && bi < b.length) {
				if (a[ai] < b[bi])
					arr[i] = a[ai++];
				else
					arr[i] = b[bi++];
			}
			else if (ai < a.length)
				arr[i] = a[ai++];
			else
				arr[i] = b[bi++];
		}
		
		return arr;
	}
	
	public static int[] mergesort(int[] array) {
		if (array == null)
			return null;
		else if (array.length <= 1)
			return array;
		else {
			int midlen = array.length / 2; 
			
			int[] left = Arrays.copyOf(array, midlen);
			int[] right = Arrays.copyOfRange(array, midlen, array.length);
			
			return merge(mergesort(left), mergesort(right));
		}
	}
}
