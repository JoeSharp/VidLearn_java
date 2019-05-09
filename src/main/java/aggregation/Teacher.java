package aggregation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Teacher extends Person {
    final List<String> subjects;

    Teacher(final String name, final String...subjects) {
        super(name);

        this.subjects = Stream.of(subjects).collect(Collectors.toList());
    }
}
