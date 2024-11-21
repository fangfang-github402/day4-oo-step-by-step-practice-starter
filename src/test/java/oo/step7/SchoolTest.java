package oo.step7;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import oo.Klass;
import oo.School;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SchoolTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    private String systemOut() {
        return outContent.toString();
    }

    @Test
    public void should_print_all_introductions_when_startSchool_given_teachers_and_students() {
        School school = new School();
        Teacher jerry = new Teacher(1, "Jerry", 21);
        school.teachers.add(jerry);
        Teacher robert = new Teacher(2, "Robert", 20);
        school.teachers.add(robert);
        Student tom = new Student(1, "Tom", 18);
        school.students.add(tom);

        school.startSchool();
        assertThat(systemOut()).contains("My name is Jerry. I am 21 years old. I am a teacher.");
        assertThat(systemOut()).contains("My name is Robert. I am 20 years old. I am a teacher.");
        assertThat(systemOut()).contains("My name is Tom. I am 18 years old. I am a student.");
    }
}
