package example.codeclan.com.employeestartpoint;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
/**
 * Created by yanren on 31/10/2017.
 */

public class AdminTest {

    Admin admin1;

    @Before

    public void before() {
        this.admin1 = new Admin(1, "Maria", "TF567", 25000.00);
    }

    @Test

    public void testSuperProperties() {
        assertEquals(1, this.admin1.getId());
        assertEquals("Maria", this.admin1.getName());
        assertEquals("TF567", this.admin1.getSocialSecurityNumber());
        assertEquals(25000.00, this.admin1.getSalary(), 0.01);
    }

    @Test
    public void testSetName() {
        admin1.setName("Rick");
        assertEquals("Rick", admin1.getName());
    }

}
