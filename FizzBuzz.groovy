import org.junit.Test
import static org.junit.Assert.*

class FizzBuzzTest {

	@Test
	public void "test with number 1"() {
		FizzBuzz fizzBuzz = new FizzBuzz()
		Integer numberOne = new Integer(1)
		assertEquals(1, fizzBuzz.returnValue(numberOne))
	}

	@Test
	public void "test with number 2"() {
		FizzBuzz fizzBuzz = new FizzBuzz()
		Integer numberTwo = new Integer(2)
		assertEquals(2, fizzBuzz.returnValue(numberTwo))
	}


}

class FizzBuzz {

	public Integer returnValue(Integer theNumberToTest) {
		return theNumberToTest
	}
}