package unit16;

import java.math.BigInteger;

public class Task01 {
	public static void main(String[] args) {
		StringBuilder numStr = new StringBuilder();
		numStr.append("1");
		for (int i = 0; i < 49; i++) {
			numStr.append("0");
		}
		
		BigInteger a = new BigInteger(numStr.toString());
		BigInteger big0 = new BigInteger("0");
		BigInteger big1 = new BigInteger("1");
		BigInteger big2 = new BigInteger("2");
		BigInteger big3 = new BigInteger("3");
		int n = 0;
		while (n < 10) {
			a = a.add(big1);
			if (a.divideAndRemainder(big2)[1].compareTo(big0) == 0) {
				System.out.printf("%s mod 2 = 0\n", a);
				n++;
			}
			else if (a.divideAndRemainder(big3)[1].compareTo(big0) == 0) {
				System.out.printf("%s mod 3 = 0\n", a);
				n++;
			}
		}
	}
}
