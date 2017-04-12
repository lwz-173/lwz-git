package cn.lwz.test;

public class Test {

	public static void main(String[] args) {
		byte a = 2;
		short b = 1;
		char s = 'a';
		char s1 = 'жа';
		int c = 1;
		float d = 1;
		long e = 1;
		double f = 1;
		String str = "жа";
		byte[] arr = str.getBytes();
		for (byte g : arr) {
			System.out.println(Integer.toString(b, 10));
		}

		System.out.println(Float.SIZE);

	}
}
