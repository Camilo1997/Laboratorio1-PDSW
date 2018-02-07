package hangman.model.dictionary;

import java.util.List;

/**
*
* @author Johan Camilo López
*/
public class EnglishDictionary implements Dictionary{

	private static List<String> words;
	
	@Override
	public List<String> getAvailableWords() {
		words.add("PLAYER");
		words.add("BALL");
		words.add("SOCCER");
		words.add("RAGE");
		words.add("GAME");
		return words;
	}

}
