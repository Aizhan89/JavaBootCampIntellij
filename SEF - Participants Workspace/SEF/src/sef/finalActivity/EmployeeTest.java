import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employee = new Employee("Ivan", 32, "Developer", "Accenture", 300);
    }

    @Test
    public void getName() {
        String expectedName = "Ivan";
        assertEquals(expectedName, employee.getName());
    }

    @Test
    public void setName() {
        String expectedName = "John";
        Employee e = new Employee();
        e.setName("John");
        assertEquals(expectedName, e.getName());
    }

    @Test
    public void getAge() {
        int expectedAge = 32;
        assertEquals(expectedAge, employee.getAge());
    }

    @Test
    public void setAge() {
        int expectedAge = 40;
        Employee e = new Employee();
        e.setAge(40);
        assertEquals(expectedAge, e.getAge());
    }

    @Test
    public void getJob() {
        String expectedJob = "Developer";
        assertEquals(expectedJob, employee.getJob());
    }

    @Test
    public void setJob() {
        String expectedJob = "Tester";
        Employee e = new Employee();
        e.setJob("Tester");
        assertEquals(expectedJob, e.getJob());
    }

    @Test
    public void getCompany() {
        String expectedCompany = "Accenture";
        assertEquals(expectedCompany, employee.getCompany());
    }

    @Test
    public void setCompany() {
        String expectedCompany = "LMT";
        Employee e = new Employee();
        e.setCompany("LMT");
        assertEquals(expectedCompany, e.getCompany());
    }

    @Test
    public void getSalary() {
        Double expectedSalary = 300d;
        assertEquals(expectedSalary, (Double) employee.getSalary());
    }

    @Test
    public void setSalary() {
        Double expectedSalary = 400d;
        Employee e = new Employee();
        e.setSalary(400);
        assertEquals(expectedSalary, (Double) e.getSalary());
    }

    @Test
    public void introduce() {
        employee.introduce();
    }
}