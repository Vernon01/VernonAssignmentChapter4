package Principles.ISP.ISPViolatedTest;

import Principles.ISP.Violation.Student;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class StudentViolatedTest extends TestCase{

    Student st = new Student();


    public void testName() throws Exception
    {
        Assert.assertEquals("canola",st.studentName());
    }


    public void testAge() throws Exception
    {
        Assert.assertEquals(21,st.studentAge());
    }


    public void testNumber() throws Exception
    {
        Assert.assertEquals(447382630,st.studentNumber());
    }
}
