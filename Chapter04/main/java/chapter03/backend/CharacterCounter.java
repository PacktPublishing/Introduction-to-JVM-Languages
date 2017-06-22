package chapter03.backend;

import java.util.HashMap;
import java.util.Map;

/**
 * Class that contains a method that counts character occurrences
 * in a passed String.
 * @author Vincent
 */
public class CharacterCounter {
	/**
	 * For each unique character in the string, counts the occurrences
	 * in the same string
	 * @param text Input string
	 * @return {Character: frequency}
	 */
	public static Map<Character, Integer> countCharacters(String text) {
		if (text == null) {
			throw new IllegalArgumentException("text must not be null");
		}

		Map<Character, Integer> map = new HashMap<>();
		for (char c: text.toCharArray()) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int curValue = map.get(c);
				map.put(c, ++curValue);
			}
		}
		return map;
	}
}