package hangman.model.dictionary;

import java.util.List;

/**
*
* @author Johan Camilo López
*/
public class SpanishDictionary implements Dictionary {

	private static List<String> words;

	@Override
	public java.util.List<String> getAvailableWords() {
		words.add("MUCHO");
		words.add("PRIMERA");
		words.add("ESPAÑA");
		words.add("MADRID");
		words.add("NACIONAL");
		return words;
	}

}
