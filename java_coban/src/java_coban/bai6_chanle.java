package java_coban;

import java.util.ArrayList;
import java.util.Vector;

/*
 * Bài 0.6.
 * - Tính tổng hợp tích thương, lũy thừa
 * - Kiểm tra chẵn lẻ
 * - Tìm phần nguyên phần nguyên / dư
 */
public class bai6_chanle {
	
	
	public static void main(String[] args)
	{
		int a = 10, b = 2;
		System.out.println(sum(a, b));

		System.out.println(sub(a, b));

		System.out.println(prod(a, b));
		
		System.out.println(div(a, b));
		
		System.out.println(pow(a, b));
		
		if (isEven(a))
			System.out.println(a + " là số chẵn");
		else 
			System.out.println(a + " là số lẻ");
		
		modulo(a, b);

	}
	
	private static int sum(int a, int b)
	{
		return a + b;
	}
	
	private static int sub(int a, int b) {
		return a - b;
	}
	
	private static int prod(int a, int b)
	{
		return a * b;
	}
	
	private static double div(int a, int b) {
		return a * 1.0 / b;
	}
	
	private static int pow(int a, int b)
	{
		if (b == 0)
			return 1;
		int p = pow(a, b/2);
		if (b % 2 == 0)
			return p*p;
		return a*p*p;
	}
	
	static boolean isEven(int n)
	{
		return n%2 == 0;
	}
	
	static void modulo(int a, int b)
	{
		System.out.printf("Phần nguyên của phép chia %d/%d là %d\n", a, b,a/b);
		System.out.printf("Phần dư của phép chia %d/%d là %d\n", a, b,a%b);
	}
}
