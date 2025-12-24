package java_coban;

import java.util.ArrayList;
import java.util.Vector;

/*
 * Bài 02: Tính n!.
 */
public class bai2 {
	
	
	
	public static void main(String[] args)
	{
		int []test = {1, 3, 5, 7, 8, 10};
		for (int i : test)
		{
			System.out.println(f(i) + " - " + factorial(i));
		}
	}

	static long f(int n)
	{
		if (n == 0)
			return 1;
		return n*f(n-1);
	}
	
	static long factorial(int n)
	{
		long p = 1;
		for (int i = 1; i <= n; i++)
			p *= i;
		return p;
	}
}
