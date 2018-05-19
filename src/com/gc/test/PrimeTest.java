package com.gc.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gc.prime.Prime;

/**
 * @author Jill Xu
 *
 */
class PrimeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test1() {
		Prime primeN = new Prime();
		int expected = 2;
		int actual = primeN.prime(1);

		assertEquals(expected, actual);
	}
	
	@Test
	void test2() {
		Prime primeN = new Prime();
		int expected = 3;
		int actual = primeN.prime(2);

		assertEquals(expected, actual);
	}

	@Test
	void test3() {
		Prime primeN = new Prime();
		int expected = 5;
		int actual = primeN.prime(3);

		assertEquals(expected, actual);
	}
	@Test
	void test4() {
		Prime primeN = new Prime();
		int expected = 7;
		int actual = primeN.prime(4);

		assertEquals(expected, actual);
	}
	@Test
	void test5() {
		Prime primeN = new Prime();
		int expected = 13;
		int actual = primeN.prime(6);

		assertEquals(expected, actual);
	}

	void test6() {
		Prime primeN = new Prime();
		int expected = 29;
		int actual = primeN.prime(10);

		assertEquals(expected, actual);
	}


}
