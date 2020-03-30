import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    
    Director director;
    
    @Before
    public void before() {
        director = new Director("Mike",45,45000,"Chairman",175000.50);
    }

    @Test
    public void canGetName() {
        assertEquals("Mike", director.getName());
    }

    @Test
    public void canGetNiNumber() {
        assertEquals(45, director.getNINumber());
    }

    @Test
    public void canGetSalary() {
        assertEquals(45000, director.getSalary(), 00);
    }

    @Test
    public void canGetDepartmentName() {
        assertEquals("Chairman", director.getDepartmentName());
    }

    @Test
    public void canGetBudget() {
        assertEquals(175000.50, director.getBudget());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(2000);
        assertEquals(47000, director.getSalary(), 00);
    }

    @Test
    public void canPayBonus() {
        double bonus = director.payBonus();
        assertEquals(450, bonus, 00);
    }
}
