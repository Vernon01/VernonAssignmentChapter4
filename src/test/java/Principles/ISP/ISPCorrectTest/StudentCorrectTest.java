package Principles.ISP.ISPCorrectTest;

import Principles.ISP.Correction.StudentInfo;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class StudentCorrectTest extends TestCase {

    StudentInfo cm = new StudentInfo();


    public void testName() throws Exception
    {
        Assert.assertEquals("alova",cm.studentName());
    }


    public void testAge() throws Exception
    {
        Assert.assertEquals(19,cm.studentAge());
    }


    public void testNumber() throws Exception
    {
        Assert.assertEquals(231456787,cm.studentNumber());
    }
}
