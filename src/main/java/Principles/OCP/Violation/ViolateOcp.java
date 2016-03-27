package Principles.OCP.Violation;

/**
 * Created by VERNON on 2016/03/27.
 */
public class ViolateOcp {

    public int add()
    {
        int a = 43;
        int b = 56;
        int c = a + b;

        return c;
    }

    public int subtract()
    {
        int a = 39;
        int b = 23;
        int c = a - b;

        return c;
    }
}
