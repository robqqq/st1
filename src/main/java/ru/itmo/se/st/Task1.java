package ru.itmo.se.st;

public class Task1 {
	public static final double[] E = {
		1, 1, 5, 61, 1385, 50521
	};
	
	public static double sec(double x) {
		return 1 / Math.cos(x);
	}
	
	public static double f(double x) {
		int fact = 1;
		double f = 0;
		double xm = 1;
		
		for (int i = 0; i < E.length; ++i) {
			f += E[i] * xm / fact;
			xm *= x * x;
			fact *= (2 * i + 1) * (2 * i + 2);
		}
		
		return f;
	}
}
