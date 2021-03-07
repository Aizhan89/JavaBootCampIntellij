import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person("Alisa", 25);
    }

    @Test
    public void getName() {
        String expectedName = "Alisa";
        assertEquals(expectedName,person.getName());
    }

    @Test
    public void setName() throws IllegalNameException {
        String expectedName = "John";
        Person p = new Person();
        p.setName("John");
        assertEquals(expectedName,p.getName());
    }

    @Test
    public void getAge() {
        int expectedAge = 25;
        assertEquals(expectedAge, person.getAge());
    }

    @Test
    public void setAge() {
        int expectedAge = 25;
        Person p = new Person();
        p.setAge(30);
        assertEquals(expectedAge, p.getAge());
    }

    @Test
    public void introduce() {
        person.introduce();
    }
}