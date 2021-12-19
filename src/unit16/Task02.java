package unit16;

import java.math.BigInteger;

public class Task02 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger(String.valueOf(Long.MAX_VALUE));
		BigInteger big0 = new BigInteger("0");
		BigInteger big1 = new BigInteger("1");
		BigInteger big5 = new BigInteger("5");
		BigInteger big6 = new BigInteger("6");
		int n = 0;
		while (n < 10) {
			a = a.add(big1);
			if (a.divideAndRemainder(big5)[1].compareTo(big0) == 0) {
				System.out.printf("%s mod 5 = 0\n", a);
				n++;
			}
			else if (a.divideAndRemainder(big6)[1].compareTo(big0) == 0) {
				System.out.printf("%s mod 6 = 0\n", a);
				n++;
			}
		}
		
	}

}
