package Principles.LSP.Violation;

/**
 * Created by VERNON on 2016/03/27.
 */
public class DogViolation extends AnimalViolation{

    public String walk()
    {
        return "walking";
    }

    public String run()
    {
        return "running";
    }

    public String eats()
    {
        return "eating";
    }
}
