import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Funky Town", "Bob Ross", 90210, 100000, 1000);
    }

    @Test
    public void canGetBudget() {
        assertEquals(1000, director.getBudget(), 0.01);
    }

    @Test
    public void canDoubleBonus() {
        director.payBonus();
        assertEquals(20000, director.payBonus(), 0.01);
    }
}
