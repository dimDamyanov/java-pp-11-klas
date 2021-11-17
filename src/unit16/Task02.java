package unit16;

import java.math.BigInteger;

public class Task02 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger(String.valueOf(Long.MAX_VALUE));
		BigInteger b = new BigInteger("1");
		int n = 0;
		while (n < 10) {
			a = a.add(b);
			if (a.divideAndRemainder(new BigInteger("5"))[1].compareTo(new BigInteger("0")) == 0) {
				System.out.printf("%s mod 5 = 0\n", a);
				n++;
			}
			else if (a.divideAndRemainder(new BigInteger("6"))[1].compareTo(new BigInteger("0")) == 0) {
				System.out.printf("%s mod 6 = 0\n", a);
				n++;
			}
		}
		
	}

}
