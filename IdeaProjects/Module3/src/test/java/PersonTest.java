import org.example.class3.Person3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testGetName() {
        Person3 person = new Person3("Alice", 30);
        assertEquals("Alice", person.getName());
    }

    @Test
    public void testGetAge() {
        Person3 person = new Person3("Bob", 25);
        assertEquals(25, person.getAge());
    }

    @Test
    public void testIsAdult() {
        Person3 adultPerson = new Person3("Charlie", 35);
        Person3 childPerson = new Person3("David", 10);

        assertTrue(adultPerson.isAdult()); // Charlie is an adult
        assertFalse(childPerson.isAdult()); // David is not an adult
    }

    @Test
    public void testEquality() {
        Person3 person1 = new Person3("Eve", 28);
        Person3 person2 = new Person3("Eve", 28);

        assertNotEquals(person1, person2); // Check if person1 and person2 are equal
    }

    @Test
    public void testInequality() {
        Person3 person1 = new Person3("Frank", 30);
        Person3 person2 = new Person3("George", 35);

        assertNotEquals(person1, person2); // Check if person1 and person2 are not equal
    }

    @Test
    public void testNotNull() {
        Person3 person = new Person3("Hannah", 22);
        assertNotNull(person); // Check if person is not null
    }

    @Test
    public void testNull() {
        Person3 person = null;
        assertNull(person); // Check if person is null
    }
}
