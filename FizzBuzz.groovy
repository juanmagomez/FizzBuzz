import org.junit.Test
import org.junit.Before

import static org.junit.Assert.*

class FizzBuzzTest {

	FizzBuzz fizzBuzz

	@Before
	public void setUp() {
		fizzBuzz = new FizzBuzz()
	}

	@Test
	public void "test with number 1"() {
		assertEquals("1", fizzBuzz.returnValue(1))
	}

	@Test
	public void "test with number 2"() {
		assertEquals("2", fizzBuzz.returnValue(2))
	}

	@Test
	public void "test with number 3"() {
		assertEquals("Fizz", fizzBuzz.returnValue(3))
	}

	@Test
	public void "test withf number 5"() {
		assertEquals("Buzz", fizzBuzz.returnValue(5))
	}

}

class FizzBuzz {

	static {
		Number.metaClass.isDivisibleByThree = {
			delegate % 3 == 0
		}
		Number.metaClass.isDivisibleByFive = {
			delegate % 5 == 0
		}
	}

	def returnValue = {theNumberToTest ->
		if(theNumberToTest.divisibleByThree) {
			return "Fizz"
		}
		if(theNumberToTest.divisibleByFive) {
			return "Buzz"
		}
		return theNumberToTest.toString()
	}
}