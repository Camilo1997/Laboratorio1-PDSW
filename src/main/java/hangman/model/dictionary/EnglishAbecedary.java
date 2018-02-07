package hangman.model.dictionary;

import java.util.ArrayList;
import java.util.List;

public class EnglishAbecedary implements Abecedary {

	@Override
	public List<Character> createCharacterSet() {
        List<Character> result = new ArrayList<>();
        char begin = 65;
        char end = 65+26;
        for(char c = begin;c < end;c++) {
            result.add(c);
        }
        return result;
	}

}
