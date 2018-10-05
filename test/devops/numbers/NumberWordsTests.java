package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numberElevenReturnsCorrectly() {
		Assert.assertEquals("Success", "Eleven", numberWords.toWords(11));
	}
	
	@Test
	public void numberThreeHundredOneReturnsCorrectly() {
		Assert.assertEquals("Success", "Three Hundred  One", numberWords.toWords(301));
	}
	
	@Test
	public void numberNinetyNineReturnsCorrectly() {
		Assert.assertEquals("Success", "Ninety Nine", numberWords.toWords(99));
	}
	
}
