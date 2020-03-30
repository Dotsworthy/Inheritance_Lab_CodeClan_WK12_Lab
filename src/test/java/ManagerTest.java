import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Steve", 123, 32000, "Coaching");
    }

    @Test
    public void canGetName() {
        assertEquals("Steve", manager.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(123, manager.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(32000, manager.getSalary(), 00);
    }

    @Test
    public void canGetDepartmentName() {
        assertEquals("Coaching", manager.getDepartmentName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(2000);
        assertEquals(34000, manager.getSalary(), 00);
    }

    @Test
    public void salaryCantBeReduced() {
        manager.raiseSalary(-100);
        assertEquals(32000, manager.getSalary(), 00);
    }

    @Test
    public void canPayBonus() {
        double bonus = manager.payBonus();
        assertEquals(320, bonus, 00);
    }
}
