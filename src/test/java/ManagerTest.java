import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Funky Town", "Bob Ross", 90210, 100000);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000);
        assertEquals(110000, manager.getSalary(), 0.01);
    }

    @Test
    public void cantRaiseSalaryDueToNegativeNumber() {
        manager.raiseSalary(-1000);
        assertEquals(100000, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(1000, manager.payBonus(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("Funky Town", manager.getDeptName());
    }

    @Test
    public void canChangeName() {
        manager.setName("Bobby Rossy");
        assertEquals("Bobby Rossy", manager.getName());
    }

    @Test
    public void cantChangeNameIfNull() {
        manager.setName(null);
        assertEquals("Bob Ross", manager.getName());
    }
}
