package Principles.DIP.DIPViolationTest;

import Principles.DIP.Violation.CalculateClass;
import Principles.DIP.Violation.SubtractClass;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class ViolationTest extends TestCase {

    CalculateClass cc = new CalculateClass();
    SubtractClass sc = new SubtractClass();


    public void testAdd() throws Exception
    {
        Assert.assertEquals(80,cc.calcing());
    }


    public void testSub() throws Exception
    {
        Assert.assertEquals(11,sc.calcing());
    }
}
