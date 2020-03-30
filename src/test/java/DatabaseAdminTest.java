import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Matt", 17, 23000);
    }

    @Test
    public void canGetName() {
        assertEquals("Matt", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber() {
        assertEquals(17, databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(23000, databaseAdmin.getSalary(), 00);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(2000);
        assertEquals(25000, databaseAdmin.getSalary(), 00);
    }

    @Test
    public void salaryCantBeReduced() {
        databaseAdmin.raiseSalary(-100);
        assertEquals(23000, databaseAdmin.getSalary(), 00);
    }

    @Test
    public void canPayBonus() {
        double bonus = databaseAdmin.payBonus();
        assertEquals(230, bonus, 00);
    }
}
