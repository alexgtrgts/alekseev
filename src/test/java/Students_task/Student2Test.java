package Students_task;

import junit.framework.TestCase;

public class Student2Test extends TestCase {

    public void testGetLearnHours() {
        double talant = 1;
        Student2 stud2 = new Student2("Олег");
        assertEquals(396.00, stud2.getLearnHours(talant));
    }


}