package Question2;

import Question1.Encapsulation;

/**
 * Created by VERNON on 2016/03/27.
 */
public class Polymorphism extends Encapsulation {

    private int currYear;
    private int bornYear;
    private int a = 0;


    public int setAge(int curr, int born)
    {
        a = curr - born;
        System.out.println("Age of the student is: " +a);
        return a;
    }

}
