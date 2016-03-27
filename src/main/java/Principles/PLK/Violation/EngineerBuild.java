package Principles.PLK.Violation;

/**
 * Created by VERNON on 2016/03/27.
 */
public class EngineerBuild {

    EngineerPrac ep = new EngineerPrac();


    public String EngBuild()   //violation is calling another object method from another
    {
        return ep.prac();

    }
}
