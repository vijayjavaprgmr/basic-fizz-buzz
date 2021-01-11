package com.bnpp.kata;

public class BasicFizzBuzzGame {

	public Integer normalNumbersReturnSameNumber(Integer i) {

		return i;
	}

	public String multiplesOfThreeReturnFizz(Integer i) {
		if (i % 3 == 0) {
			return "fizz";
		}
		return null;
	}

}
