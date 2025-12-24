package java_coban;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

/*
 * Bài 0.4. Giải phương trình bậc hai ax^2+bx+c=0
 */
public class bai4 {
	
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập hệ số a = ");
		float a = sc.nextFloat();
		System.out.print("Nhập hệ số b = ");
		float b = sc.nextFloat();
		System.out.print("Nhập hệ số c = ");
		float c = sc.nextFloat();
		
		/// Biện luận
		if (a == 0) // Phương trình bậc 1
		{
			if (b == 0)
			{
				if (c == 0)
					System.out.println("Phương trình có vô số nghiệm");
				else
					System.out.println("Phương trình vô nghiệm");
			}
			else
				System.out.printf("Phương trình có nghiệm x= %.3f\n", -c*1.0/(2*b)); 
		}
		else // Phương trình bậc 2
		{
			float delta = b*b-4*a*c;
			if (delta > 0)
				System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.3f; x2 = %.3f", 
						(-b+Math.sqrt(delta))/(2*a),(-b-Math.sqrt(delta))/(2*a) );
			else if (delta == 0)
				System.out.println("Phương trình có nghiệm duy nhất x = " + -b*1.0/(2*a));
			else 
				System.out.println("Phương trình vô nghiệm");
		}
	}

	
}
