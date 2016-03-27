package Principles.SRP.SRPCorrectTest;

import Principles.SRP.Correct.Class1;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class Class1Test extends TestCase {

    Class1 c1 = new Class1();


    public void testType() throws Exception
    {
        Assert.assertEquals("type",c1.type());
    }
}
