package junit.tutorial;

import static org.junit.Assert.*;

import java.util.Date;
import static junit.customMatcher.IsDate.dateOf;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
public class CalculatorTest {

	@Test
	public void maltiplyで3と4の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.maltiply(3, 4);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void maltiplyで5と7の乗算結果が取得できる() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.maltiply(5, 7);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void divideで3と2の除算結果が取得できる() {
		Calculator calc = new Calculator();
		float expected = 1.5f;
		float actual = calc.divide(3, 2);
		assertThat(actual, is(expected));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void divideで5と0のときIllegalArgumentExceptionを投げる() {
		Calculator calc = new Calculator();
		calc.divide(5, 0);
	}	
	
	@Test
	public void dateのテスト() throws Exception {
		assertThat(new Date(), is(dateOf(2014, 4, 6)));
	}
}
