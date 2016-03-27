package Principles.SRP.Violation;

/**
 * Created by VERNON on 2016/03/27.
 */
public class ViolateClass1 implements ViolateInterface{


    public String name()
    {
        String nm = "valmi";
        return nm;
    }


    public String surname()
    {
        String sur = "carlo";
        return sur;
    }


    public int age()
    {
        int age1 = 98;
        return age1;
    }
}
