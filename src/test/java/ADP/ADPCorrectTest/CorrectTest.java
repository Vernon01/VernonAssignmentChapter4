package ADP.ADPCorrectTest;

import ADP.Correct.A;
import ADP.Correct.B;
import ADP.Correct.C;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class CorrectTest extends TestCase{

    A a = new A();
    B b = new B();
    C c = new C();


    public void testAgent() throws Exception
    {
        Assert.assertEquals("lhaba",a.AgentName());
        Assert.assertEquals("noba",b.AgentSurname());
        Assert.assertEquals("short one",c.AgentHeight());
    }

}
