package basic;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MusicalScale {

    private static List<String> NOTE_NAMES = List.of("C", "C#/Db", "D", "D#/Eb", "E", "F", "F#/Gb", "G", "G#/Ab", "A", "A#/Bb", "B");
    private final List<Integer> intervals;

    private MusicalScale(Integer...intervals) {
        this.intervals = List.of(intervals);
    }

    private List<String> generateScale(final String root) throws Exception {
        int index = NOTE_NAMES.indexOf(root);

        if (index == -1) {
            throw new Exception(String.format("Invalid Root Note %s", root));
        }

        final AtomicInteger cIndex = new AtomicInteger(index);
        return intervals.stream()
                .map(interval -> NOTE_NAMES.get(cIndex.getAndAdd(interval) % NOTE_NAMES.size()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws Exception {
        final MusicalScale majorScale = new MusicalScale(2, 2, 1, 2, 2, 2, 1);

        final List<String> dMajor = majorScale.generateScale("D");
        System.out.println(String.format("D Major is %s", dMajor));

        final List<String> fSharpMajor = majorScale.generateScale("F#/Gb");
        System.out.println(String.format("F# Major is %s", fSharpMajor));
    }
}
