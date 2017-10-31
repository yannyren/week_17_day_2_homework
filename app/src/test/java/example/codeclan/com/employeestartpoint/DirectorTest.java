package example.codeclan.com.employeestartpoint;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
/**
 * Created by yanren on 31/10/2017.
 */

public class DirectorTest {
    Director director1;

    @Before
    public void before() {
        this.director1 = new Director(1, "Darren", "ER567", 50000.00, "Marketing", 1000000.00);
    }

    @Test
    public void getSuperClassProperties() {
        assertEquals(1, director1.getId());
        assertEquals("Darren", director1.getName());
        assertEquals("ER567", director1.getSocialSecurityNumber());
        assertEquals(50000.00, director1.getSalary(), 0.01);
        assertEquals("Marketing", director1.getDeptName());

    }

    @Test
    public void testGetBudget() {
        assertEquals(1000000.00, director1.getBudget(), 0.01);
    }
}
