package com.gc.prime;

import java.util.ArrayList;

/**
 * @author Jill Xu
 *
 */
public class Prime {

	/**
	 * @param input
	 * @return
	 */
	public int prime(int input) {
		int num = 1;
		boolean isPrime = true;

		ArrayList<Integer> list = new ArrayList<>();

		do {
			num++;
			for (int i = 2; i < num; i++) {// modulus by every number smaller than current number.
				if (num % i == 0) {
					isPrime = false;//if can be modulus by i, this number is not prime number
					break;
				} else {
					isPrime = true;
				}
			}

			if (isPrime) {
				list.add(num);//if it's a prime number. add it to a list.
			}
		} while (list.size() < input);

		return num;
	}
}
