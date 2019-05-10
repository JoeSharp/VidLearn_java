package aggregation;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class {
    final String subject;
    final Teacher teacher;
    final List<Student> students;

    Class(final String subject,
          final Teacher teacher,
          final Student...students) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = Stream.of(students).collect(Collectors.toList());
    }
}
