package ADP.ADPViolatedTest;

import ADP.Violation.BDepentend;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class ViolatedTest extends TestCase{

    BDepentend bd = new BDepentend();


    public void testNumbers() throws Exception
    {
        Assert.assertEquals(90,bd.numbers());
    }
}
