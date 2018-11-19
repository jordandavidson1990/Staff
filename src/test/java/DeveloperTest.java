import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("Mr Robot", 666, 5000);
    }

    @Test
    public void canGetName() {
        assertEquals("Mr Robot", developer.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(666, developer.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(5000, developer.getSalary(), 0.01);
    }
}
