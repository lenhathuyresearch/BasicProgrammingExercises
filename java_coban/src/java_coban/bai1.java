package java_coban;

import java.util.ArrayList;
import java.util.Vector;

/*
 * Bài 01:

Viết chương trình tìm tất cả các số chia hết cho 7 nhưng không phải bội số của 5, 
nằm trong đoạn 10 và 200 (tính cả 10 và 200). 
Các số thu được sẽ được in thành chuỗi trên một dòng, cách nhau bằng dấu phẩy.
 */
public class bai1 {
	
	
	
	public static void main(String[] args)
	{
		using_vector();
		using_arr();
		using_ArrayList();
	}

	private static void using_vector()
	{
		Vector<Integer> a = new Vector<Integer>();
		for (int i = 10; i <= 200; ++i)
		{
			if (i % 7 == 0 && i % 5 != 0)
				a.add(i);
		}
		for (int i = 0; i < a.size()-1; ++i)
		{
			System.out.print(a.get(i)+",");
		}
		System.out.println(a.get(a.size()-1));
	}
	
	private static void using_arr()
	{
		int a[] = new int[100];
		int dem = 0;
		for (int i = 10; i <= 200; ++i)
		{
			if (i % 7 == 0 && i % 5 != 0) {
				a[dem++] = i;
			}
		}
		for (int i = 0; i < dem-1; ++i)
		{
			System.out.print(a[i]+",");
		}
		System.out.println(a[dem-1]);
	}
	private static void using_ArrayList()
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
	
		for (int i = 10; i <= 200; ++i)
		{
			if (i % 7 == 0 && i % 5 != 0) {
				a.add(i);
			}
		}
		int dem = a.size();
		for (int i = 0; i < dem-1; ++i)
		{
			System.out.print(a.get(i)+",");
		}
		System.out.println(a.get(dem-1));
	}
}
