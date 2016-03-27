package Principles.OCP.OCPViolatedTest;

import Principles.OCP.Violation.ViolateOcp;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class ViolatedOcpTest extends TestCase{

    ViolateOcp oc = new ViolateOcp();


    public void testViolation() throws Exception
    {
        Assert.assertEquals(99,oc.add());
        Assert.assertEquals(16,oc.subtract());
    }
}
