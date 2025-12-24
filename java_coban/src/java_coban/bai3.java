package java_coban;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


/*
 * Bài 03. Hãy viết chương trình để tạo ra một map chứa (i, i*i), 
 * trong đó i là số nguyên từ 1 đến n (bao gồm cả 1 và n), n được nhập từ bàn phím. 
 * Sau đó in map này ra màn hình. Ví dụ: 
 * Giả sử số n là 8 thì đầu ra sẽ là: 
 * {1: 1, 2: 4, 3: 9, 4: 16, 5: 25, 6: 36, 7: 49, 8: 64}.
 */
public class bai3 {
	
	
	
	public static void main(String[] args)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên n = ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; ++i)
			map.put(i, i*i);
		System.out.println(map);
	}

	
}
