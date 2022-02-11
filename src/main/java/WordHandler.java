import java.util.Locale;

public class WordHandler implements IWordHandle {
    @Override
    public String HandleWord(String word) {
        var handleWord = word.trim().toUpperCase().split(" ");
        var finalWord = handleWord[handleWord.length-1];

        return finalWord;

    }
}
