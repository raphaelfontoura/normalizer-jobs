public class Normaliser {

    private ICompareWord compareWord;
    private IWordHandle wordHandler;

    public Normaliser() {
        this.compareWord = new CompareWord();
        this.wordHandler = new WordHandler();
    }

    public Normaliser(ICompareWord compareWord, IWordHandle wordHandle) {
        this.compareWord = compareWord;
        this.wordHandler = wordHandle;
    }

    public String normalise(String input) {
        var word = wordHandler.HandleWord(input);
        var qualityCompare = .1f;
        var jobNormalized = "Not found";
        for (NormalizedJobsEnum value : NormalizedJobsEnum.values()) {
          var compare = compareWord.CompareQuality(value.name().toUpperCase(), word);
          if (compare < qualityCompare) {
              qualityCompare = compare;
              jobNormalized = value.toString();
          }
        }
        return jobNormalized;
    }

}
