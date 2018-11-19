import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp() throws Exception {
        databaseAdmin = new DatabaseAdmin("Mr Smith", 010101, 3000);
    }

    @Test
    public void getName() {
        assertEquals("Mr Smith", databaseAdmin.getName());
    }

    @Test
    public void getNiNumber() {
        assertEquals(010101, databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(3000, databaseAdmin.getSalary(), 0.01);
    }
}
