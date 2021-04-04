package Students_task;

import junit.framework.TestCase;

public class Student3Test extends TestCase {

    public void testGetLearnHours() {
        double talant = 1;
        Student3 stud3 = new Student3("Коля");
        assertEquals(594.00, stud3.getLearnHours(talant));
    }
}