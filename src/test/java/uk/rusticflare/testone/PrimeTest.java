package uk.rusticflare.testone;

import static uk.rusticflare.testone.Prime.isPrime;

import org.assertj.core.api.AutoCloseableSoftAssertions;
import org.junit.Test;

public class PrimeTest {

	@Test
	public void test() {
		try (AutoCloseableSoftAssertions softly = new AutoCloseableSoftAssertions()) {
			softly.assertThat(isPrime(-1)).as("-1")
					.isFalse();
			softly.assertThat(isPrime(0)).as("0").isFalse();
			softly.assertThat(isPrime(1)).as("1").isFalse();
			softly.assertThat(isPrime(2)).as("2").isTrue();
			softly.assertThat(isPrime(3)).as("3").isTrue();
			softly.assertThat(isPrime(4)).as("4").isFalse();
			softly.assertThat(isPrime(5)).as("5").isTrue();
			softly.assertThat(isPrime(6)).as("6").isFalse();
			softly.assertThat(isPrime(7)).as("7").isTrue();
		}
	}
}
