package Principles.PLK.PLKViolatedTest;

import Principles.PLK.Violation.EngineerBuild;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class EngineerTest extends TestCase {

    EngineerBuild eb = new EngineerBuild();


    public void testBuild() throws Exception
    {
        Assert.assertEquals("practical",eb.EngBuild());
    }
}
