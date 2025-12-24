package java_coban;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 * Bài 5. 
 */
public class bai5 {
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		double p=1;
		float r=1;
		int n=1;
		try {
			System.out.print("Nhập tiền gốc P = ");
			p = Double.parseDouble(br.readLine());
			System.out.print("Nhập tiền lãi r = ");
			r = Float.parseFloat(br.readLine());
			System.out.print("Nhập số kì hạn n = ");
			n = Integer.parseInt(br.readLine());
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.printf("Lãi đơn phải trả sau %d tháng là %.3f\n", n, tinhLaiDon(p, r, n));
		System.out.printf("Lãi kép phải trả sau %d tháng là %.3f\n", n, tinhLaiKep(p, r, n));
	}
	
	static double tinhLaiDon(double p, float r, int n)
	{
		return p*r*n/100;
	}
	
	static double tinhLaiKep(double p, float r, int n)
	{
		return p*Math.pow(1+r/100.0, n)-p;
	}
}
