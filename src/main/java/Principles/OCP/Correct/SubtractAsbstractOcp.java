package Principles.OCP.Correct;

/**
 * Created by VERNON on 2016/03/27.
 */
public class SubtractAsbstractOcp extends AbstractOcp {

    private int a = 34;
    private int b = 23;

    @Override
    public int calc()
    {
        return a-b;
    }
}
