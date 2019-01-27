package numbers;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberWordTest {

private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}
	//negative Scenario.
	@Test
	public void testNumberOutOfRangeReturnsError1() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void testPositiveScenario1() {
		Assert.assertEquals("Error","Eighteen", numberWords.toWords( 18 ) ) ;
	}
}
