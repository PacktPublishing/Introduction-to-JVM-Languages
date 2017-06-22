package chapter03.backend;

import static org.junit.Assert.*;
import java.util.Map;
import org.junit.Test;

public class CharacterCounterTests {
	/**
	 * When passing null to the countCharacters method, an 
	 * IllegalArgumentException exception must be generated.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testNull() {
		CharacterCounter.countCharacters(null);
	}
	
	/**
	 * Passes a string and makes sure the returned map contains
	 * the exact amount of expected characters and then verifies
	 * the count of each character.
	 */
	@Test
	public void test() {
		Map<Character, Integer> map = CharacterCounter.countCharacters("Hello!!!");
		assertEquals(map.size(), 5);

		assertEquals(map.get('H').intValue(), 1);
		assertEquals(map.get('e').intValue(), 1);
		assertEquals(map.get('l').intValue(), 2);
		assertEquals(map.get('o').intValue(), 1);
		assertEquals(map.get('!').intValue(), 3);
	}
}