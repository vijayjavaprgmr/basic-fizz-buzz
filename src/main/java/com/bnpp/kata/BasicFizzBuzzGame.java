package com.bnpp.kata;

public class BasicFizzBuzzGame {

	public String getFizzBuzzScore(int i) {
		if (i % 15 == 0) {
			return "fizz buzz";
		} else if (i % 3 == 0) {
			return "fizz";
		} else if (i % 5 == 0) {
			return "buzz";
		}
		return Integer.toString(i);
	}
}