package hangman.model.dictionary;

import java.util.List;

/**
*
* @author Johan Camilo López
*/
public class FrenchDictionary implements Dictionary {

	private static List<String> words;
	
	@Override
	public List<String> getAvailableWords() {
		words.add("CETTE");
		words.add("ON");
		words.add("SES");
		words.add("TOUT");
		words.add("SANS");
		return words;
	}

}
