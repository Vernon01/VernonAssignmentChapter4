package Principles.LSP.Violation;

/**
 * Created by VERNON on 2016/03/27.
 */
public class FishViolation extends AnimalViolation{

    public String walk() //fish cant walk (violation)
    {
        return "walking";
    }

    public String run() //fish cant run (violation)
    {
        return "running";
    }

    public String eats()
    {
        return "eating";
    }
}
