package Principles.LSP.LSPViolatedTest;

import Principles.LSP.Violation.AnimalViolation;
import Principles.LSP.Violation.DogViolation;
import Principles.LSP.Violation.FishViolation;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class LSPViolatedTest extends TestCase{

    AnimalViolation doggy1 = new DogViolation();
    AnimalViolation fishy = new FishViolation();


    public void testMethodsDog()
    {
        Assert.assertEquals("walking", doggy1.walk());
        Assert.assertEquals("running",doggy1.run());
        Assert.assertEquals("eating",doggy1.eats());
    }


    public void testMethodsFish()
    {
        Assert.assertEquals("walking",fishy.walk()); //violate
        Assert.assertEquals("running",fishy.run());  //violate
        Assert.assertEquals("eating",fishy.eats());
    }
}
