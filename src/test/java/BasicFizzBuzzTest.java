import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import com.bnpp.kata.BasicFizzBuzzGame;

public class BasicFizzBuzzTest {

	@Test
	public void testNormalNumbersReturnSameNumber() {
		BasicFizzBuzzGame basicFissBuzz = new BasicFizzBuzzGame();
		assertThat(basicFissBuzz.normalNumbersReturnSameNumber(1), is(1));
	}

	@Test
	public void testMultiplesofThreeReturnFizz() {
		BasicFizzBuzzGame basicFissBuzz = new BasicFizzBuzzGame();
		assertThat(basicFissBuzz.multiplesofThreeRturnFizz(123), is("fizz"));
	}

}
