/**
 * 
 */
package cn.lwz.test;

import java.util.Scanner;

/**
 * @author lwz
 *
 */
public class ABCTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个整数");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("共有" + ABCMethod(n) + "个优雅数");

	}

	public static int ABCMethod(int n) {
		int ABCNum = (n - 2) * 6*(int)Math.pow(3, n-3);
		int darkNum = (int)Math.pow(3, n) - ABCNum;
		return darkNum;
	}

}
