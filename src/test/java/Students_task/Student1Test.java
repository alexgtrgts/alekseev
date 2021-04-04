package Students_task;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class Student1Test extends TestCase {

    @Test
    public void testGetLearnHours() {
        double talant = 1;
        Student1 stud1 = new Student1("Игорь");
        assertEquals(198.00, stud1.getLearnHours(talant));
    }
}