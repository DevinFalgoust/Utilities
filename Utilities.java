package devinfalgoust.util;

import java.util.ArrayList;
import java.util.List;

/**
 * This class was made to house a bunch of utility functions that I have found useful.
 * 
 * @author Devin Falgoust
 */
public class Utilities {

	/**
	 * This function takes a string (text) and splits it into multiple substrings
	 * based upon the size passed (newStringSize) and returns them in a List
	 * 
	 * @author Guillaume Polet
	 * http://stackoverflow.com/questions/9276639/java-how-to-split-a-string-by-a-number-of-characters
	 * 
	 * @param text - the array you wish to split
	 * @param newStringSize - the max size of the new arrays
	 * @return
	 */
	public static List<String> splitStringBySize(String text, Integer newStringSize) {
		List<String> strings = new ArrayList<String>();
		int index = 0;
		while (index < text.length()) {
			strings.add(text.substring(index, Math.min(index + newStringSize, text.length())));
			index += newStringSize;
		}
		return strings;
	}
	
}
