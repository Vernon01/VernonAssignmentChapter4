package Principles.ISP.Correction;

/**
 * Created by VERNON on 2016/03/27.
 */
public class StudentInfo implements StudentName, StudentAge, StudentNumber{


    public String studentName()
    {
        String na = "alova";
        return na;
    }


    public int studentAge()
    {
        int agi = 19;
        return agi;
    }


    public int studentNumber()
    {
        int stuN = 231456787;
        return stuN;
    }
}
