package com.prepinsta.collections;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		int n = 123;
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum += rem;
			n /= 10;
		}
		System.out.println(sum);
	}

}
