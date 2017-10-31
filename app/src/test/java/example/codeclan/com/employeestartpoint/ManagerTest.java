package example.codeclan.com.employeestartpoint;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
/**
 * Created by yanren on 31/10/2017.
 */

public class ManagerTest {

    Manager manager1;

    @Before
    public void before() {
        this.manager1 = new Manager(1, "Ross", "CD008", 30000.00, "Sales");
    }

    @Test
    public void testGetSuperClassProperties() {
        assertEquals(1, this.manager1.getId());
        assertEquals("Ross", this.manager1.getName());
        assertEquals("CD008", this.manager1.getSocialSecurityNumber());
        assertEquals(30000.00, this.manager1.getSalary(), 0.01);
        assertEquals("Sales", this.manager1.getDeptName());
    }

    @Test
    public void testSetName() {
        manager1.setName("Mike");
        assertEquals("Mike", manager1.getName());
    }

    @Test
    public void testGetDeptName() {
        assertEquals("Sales", this.manager1.getDeptName());
    }



}
