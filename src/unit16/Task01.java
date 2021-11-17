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
		BigInteger b = new BigInteger("1");
		int n = 0;
		while (n < 10) {
			a = a.add(b);
			if (a.divideAndRemainder(new BigInteger("2"))[1].compareTo(new BigInteger("0")) == 0) {
				System.out.printf("%s mod 2 = 0\n", a);
				n++;
			}
			else if (a.divideAndRemainder(new BigInteger("3"))[1].compareTo(new BigInteger("0")) == 0) {
				System.out.printf("%s mod 3 = 0\n", a);
				n++;
			}
		}
	}
}
