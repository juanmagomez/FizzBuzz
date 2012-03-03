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
		Integer numberOne = new Integer(1)
		assertEquals("1", fizzBuzz.returnValue(numberOne))
	}

	@Test
	public void "test with number 2"() {
		Integer numberTwo = new Integer(2)
		assertEquals("2", fizzBuzz.returnValue(numberTwo))
	}

	@Test
	public void "test with number 3"() {
		Integer numberThree = new Integer(3)
		assertEquals("Fizz", fizzBuzz.returnValue(numberThree))
	}

}

class FizzBuzz {

	def returnValue = {theNumberToTest ->
		if(isDivisibleByThree(theNumberToTest)) {
			return "Fizz"
		}
		return theNumberToTest.toString()
	}

	def isDivisibleBy = {theNumber, theDivisor ->
		theNumber % theDivisor == 0
	}

	def isDivisibleByThree = {theNumber ->
		isDivisibleBy(theNumber, 3)
	}
}