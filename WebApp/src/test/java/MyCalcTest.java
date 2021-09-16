import static org.junit.Assert.*;

import com.lti.jenkins.MyCalculator;

import org.junit.Test;

public class MyCalcTest {

	@Test
	public void test1() {
		assertEquals(5, new MyCalculator().sum(2, 3));
	}
	
	@Test
	public void test2() {
		assertEquals(15, new MyCalculator().sum(20, -5));
	}
	
	@Test
	public void test3() {
		assertEquals(13, new MyCalculator().sum(13, 0));
	}

}
