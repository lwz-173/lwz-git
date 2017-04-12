/**
 * 
 */
package cn.lwz.test;

import java.util.Scanner;

/**
 * @author lwz
 *
 */
public class Circle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个整数");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num = CircleNum(n);
		System.out.println("共有" + num + "个优雅数");

	}

	public static int CircleNum(int n) {
//		double max = Math.sqrt(n);
//		if (Math.floor(max) == max) {
//			num = 4;
//		}
//		max = Math.floor(max);
//		int maxNum = (int) max;
		int num = 0;
		for (int i = 1; i*i <= n; i++) {
			double x = Math.sqrt(n - i * i);
			if (Math.floor(x) == x ) {
				num += 4;
			}
		}
		return num;
	}

}
