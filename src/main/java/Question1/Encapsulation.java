package Question1;

/**
 * Created by VERNON on 2016/03/27.
 */
public abstract class Encapsulation {

    private String name;
    private String surname;
    private int studentNumber;
    private int age;

    public Encapsulation()
    {

    }

    public void setName(String nm)
    {
        name = nm;
    }

    public String getName()
    {
        return name;
    }

    public void setSurname(String sur)
    {
        surname = sur;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setStudentNum(int studNum)
    {
        studentNumber = studNum;
    }

    public int getStudentnum()
    {
        return studentNumber;
    }

    public int setAge(int a, int b)
    {
        age = a - b;
        return age;
    }

    public int getAge()
    {
        return age;
    }

}
