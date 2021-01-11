package com.bnpp.kata;

public class BasicFizzBuzzGame {

	public Integer normalNumbersReturnSameNumber(Integer i) {

		return i;

	}

	public String multiplesofThreeRturnFizz(Integer i) {
		if (i % 3 == 0) {
			return "fizz";
		}
		return null;
	}

	public String multiplesofFiveRturnBuzz(Integer i) {
		if (i % 5 == 0) {
			return "buzz";
		}
		return null;
	}

	public String multipleofThreeandFiveReturnFizzBuzz(Integer i) {
		if (i % 15 == 0) {
			return "fizz buzz";
		}
		return null;
	}
}