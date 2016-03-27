package Principles.DIP.Violation;

/**
 * Created by VERNON on 2016/03/27.
 */
public class CalculateClass implements AddInterface{


    public int calcing()
    {
        int  c = 39 + 41;
        return c;
    }
}
