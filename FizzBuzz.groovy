import groovy.util.GroovyTestCase

class FizzBuzzTest extends GroovyTestCase {

	public void "test with number 1"() {
		FizzBuzz fizzBuzz = new FizzBuzz()
		Integer numberOne = new Integer(1);
		assertEquals(1, fizzBuzz.returnValue(numberOne))
	}

}

class FizzBuzz {

}