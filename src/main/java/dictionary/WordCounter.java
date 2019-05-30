package dictionary;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class WordCounter {
    public static void main(String[] args) {

        final String toAnalyze = "peter piper picked a peck of pickled peppers a " +
                "peck of pickled peppers peter piper picked if peter piper picked " +
                "a peck of pickled peppers how many pickled peppers did peter piper pick";


        final ConcurrentHashMap<String, AtomicInteger> wordFrequency = new ConcurrentHashMap<>();

        Stream.of(toAnalyze.split(" "))
                .peek(s -> wordFrequency.computeIfAbsent(s, (x) -> new AtomicInteger()))
                .map(wordFrequency::get)
                .forEach(AtomicInteger::incrementAndGet);

        System.out.println("Word Frequency");
        wordFrequency.forEach((key, value) -> System.out.println(String.format("%s: %d", key, value.get())));
    }
}
