package Principles.SRP.SRPViolatedTest;

import Principles.SRP.Violation.ViolateClass1;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class ViolateClassTest extends TestCase{

    ViolateClass1 vc = new ViolateClass1();


    public void testName() throws Exception
    {
        Assert.assertEquals("valmi",vc.name());
    }


    public void testSurname() throws Exception
    {
        Assert.assertEquals("carlo",vc.surname());
    }


    public void testAge() throws Exception
    {
        Assert.assertEquals(98,vc.age());
    }
}
