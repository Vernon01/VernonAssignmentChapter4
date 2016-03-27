package Principles.OCP.Correct;

/**
 * Created by VERNON on 2016/03/27.
 */
public class AddAbstractOcp extends AbstractOcp{

    private int a = 50;
    private int b = 60;


    @Override
    public int calc()
    {
        return a+b;
    }
}
