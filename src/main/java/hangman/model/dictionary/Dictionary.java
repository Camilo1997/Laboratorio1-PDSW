package hangman.model.dictionary;

import java.util.List;

public interface Dictionary {

    public List<String> getAvailableWords();
    public List<Character> getCharacterSet();
    
}
