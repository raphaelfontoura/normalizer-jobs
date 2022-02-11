import java.util.Arrays;

public class CompareWord implements ICompareWord {
    @Override
    public float CompareQuality(String job, String word) {
        var quality = 0f;
        var length = job.length();
        var jobArray = Arrays.asList(job.split(""));
        var wordArray = Arrays.asList(word.split(""));
        var differences = jobArray.stream()
                .filter(element -> !wordArray.contains(element))
                .count();

        quality = (float) differences / length;
        return quality;
    }
}
