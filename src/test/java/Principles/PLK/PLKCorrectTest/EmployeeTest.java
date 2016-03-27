package Principles.PLK.PLKCorrectTest;

import Principles.PLK.Correct.EmployeeName;
import Principles.PLK.Correct.EmployeeNumber;
import Principles.PLK.Correct.EmployeeSurname;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created by VERNON on 2016/03/27.
 */
public class EmployeeTest extends TestCase {

    EmployeeName empNam = new EmployeeName();
    EmployeeNumber empNumber = new EmployeeNumber();
    EmployeeSurname empSur = new EmployeeSurname();


    public void testEmployee() throws Exception
    {
        Assert.assertEquals("vernon",empNam.empName());
        Assert.assertEquals("2314949302",empNumber.empNum());
        Assert.assertEquals("swartland",empSur.empSurname());
    }
}
