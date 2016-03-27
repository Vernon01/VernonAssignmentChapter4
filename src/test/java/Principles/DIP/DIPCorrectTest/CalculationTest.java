package Principles.DIP.DIPCorrectTest;

import Principles.DIP.Correct.Calculation;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by VERNON on 2016/03/27.
 */
public class CalculationTest extends TestCase {

    Calculation c = new Calculation();


    public void testAdd() throws Exception
    {
        Assert.assertEquals(90,c.adding());
    }


    public void testSubtract() throws Exception
    {
        Assert.assertEquals(75,c.subtracting());
    }
}
