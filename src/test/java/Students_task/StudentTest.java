package Students_task;

import junit.framework.TestCase;
import org.junit.Assert;

public class StudentTest extends TestCase {

    public void testGetLearnHours() {
        Student stud = new Student();
        double talant = 1;
        assertEquals(198.00, stud.getLearnHours(talant));
    }
}