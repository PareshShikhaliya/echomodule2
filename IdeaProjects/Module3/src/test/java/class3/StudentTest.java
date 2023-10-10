package class3;

import org.example.class3.Student5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentDetails() {
        Student5 student = new Student5("Alice", 16);

        // Grouping multiple assertions for the 'student' object using assertAll
        assertAll("student",
                () -> assertEquals("Alice", student.getName(), "Name should match"), // Check if the name matches
                () -> assertEquals(16, student.getAge(), "Age should match"), // Check if the age matches
                () -> assertTrue(student.isTeenager(), "Should be a teenager") // Check if the student is a teenager
        );
    }

    @Test
    public void testStudentDetails3() {
        Student5 student = new Student5("Alice", 16);
        assertEquals("Alice", student.getName(), "Name should match");
        assertEquals(16, student.getAge(), "Age should match");
        assertTrue(student.isTeenager(), "Should be a teenager");
    }


    @Test
    public void testAnotherStudentDetails() {
        Student5 student = new Student5("Bob", 21);

        // Grouping multiple assertions for another 'student' object using assertAll
        assertAll("student",
                () -> assertEquals("Bob", student.getName(), "Name should match"), // Check if the name matches
                () -> assertEquals(21, student.getAge(), "Age should match"), // Check if the age matches
                () -> assertFalse(student.isTeenager(), "Should not be a teenager") // Check if the student is not a teenager
        );
    }
}

