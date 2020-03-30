import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
    developer = new Developer("Allan", 210, 27000);
    }

    @Test
    public void canGetName() {
        assertEquals("Allan", developer.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals(210, developer.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(27000, developer.getSalary(), 00);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2000);
        assertEquals(29000, developer.getSalary(), 00);
    }

    @Test
    public void canPayBonus() {
        double bonus = developer.payBonus();
        assertEquals(270, bonus, 00);
    }
}
