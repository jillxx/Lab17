package com.gc.prime;

import java.util.Scanner;

/**
 * @author Jill Xu 5/19/2018
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Prime primeNum = new Prime();
		String count = "y";

		System.out.println("Let's locate some primes!\n");
		System.out.println("This application will find you any prime, inorder, from first prime number on.");

		while (count.equalsIgnoreCase("y")) {
			int input = Validator.getInt(scnr, "Which prime number are you looking for?");

			System.out.println("\nThe number " + input + " prime is " + primeNum.prime(input)+".\n");

			count = Validator.getString(scnr, "Do you want to find another prime number?(y/n): ");

		}

		System.out.println("Good bye!");
		scnr.close();
	}

}
