package uk.rusticflare.testone;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.rusticflare.testone.Prime.isPrime;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test() {
		assertThat(isPrime(-1)).as("-1").isFalse();
		assertThat(isPrime(0)).as("0").isFalse();
		assertThat(isPrime(1)).as("1").isFalse();
		assertThat(isPrime(2)).as("2").isTrue();
		assertThat(isPrime(3)).as("3").isTrue();
		assertThat(isPrime(4)).as("4").isFalse();
		assertThat(isPrime(5)).as("5").isTrue();
		assertThat(isPrime(6)).as("6").isFalse();
		assertThat(isPrime(7)).as("7").isTrue();
	}
}
