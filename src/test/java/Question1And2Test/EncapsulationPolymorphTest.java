package Question1And2Test;

import Question1.Encapsulation;
import Question2.Polymorphism;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by VERNON on 2016/03/27.
 */
public class EncapsulationPolymorphTest extends TestCase {

    Encapsulation m = new Polymorphism();


    public void testAge() throws Exception
    {
        Assert.assertEquals(22, m.setAge(2015, 1993));
    }
}
