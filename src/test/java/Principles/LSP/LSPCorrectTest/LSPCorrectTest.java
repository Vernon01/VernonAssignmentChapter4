package Principles.LSP.LSPCorrectTest;

import Principles.LSP.Correct.Animal;
import Principles.LSP.Correct.Cat;
import Principles.LSP.Correct.Dog;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class LSPCorrectTest extends TestCase{

    Animal doggy = new Dog();
    Animal catty = new Cat();


    public void testMethodsDog()
    {
        Assert.assertEquals("walking",doggy.walk());
        Assert.assertEquals("running",doggy.run());
        Assert.assertEquals("eating",doggy.eats());
    }


    public void testMethodsCat()
    {
        Assert.assertEquals("walking",catty.walk());
        Assert.assertEquals("running",catty.run());
        Assert.assertEquals("eating",catty.eats());
    }
}
