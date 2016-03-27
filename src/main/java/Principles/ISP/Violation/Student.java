package Principles.ISP.Violation;

/**
 * Created by VERNON on 2016/03/27.
 */
public class Student implements StudentInformation{


    public String studentName()
    {
        String na = "canola";
        return na;
    }


    public int studentAge()
    {
        int agi = 21;
        return agi;
    }


    public int studentNumber()
    {
        int stuN = 447382630;
        return stuN;
    }
}
