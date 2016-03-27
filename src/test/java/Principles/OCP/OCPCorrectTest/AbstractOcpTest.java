package Principles.OCP.OCPCorrectTest;

import Principles.OCP.Correct.AddAbstractOcp;
import Principles.OCP.Correct.SubtractAsbstractOcp;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class AbstractOcpTest extends TestCase {

    AddAbstractOcp add = new AddAbstractOcp();
    SubtractAsbstractOcp subb = new SubtractAsbstractOcp();


    public void testAdd()throws Exception
    {
        Assert.assertEquals(110,add.calc());
    }


    public void testSub()throws Exception
    {
        Assert.assertEquals(11,subb.calc());
    }
}
