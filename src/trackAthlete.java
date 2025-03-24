/**
 * @author Aimery Dreux
 */
public class trackAthlete{
    private String name;
    private String category;
    private int grade;

    public trackAthlete(String name, String category, int grade)
    {
        this.name = name;
        this.category = category;
        this.grade = grade;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }

    public String getCategory()
    {
        return category;
    }
    public void setCategory(String n)
    {
        category = n;
    }

    public int getGrade()
    {
        return grade;
    }
    public void setGrade(int n)
    {
        grade = n;
    }

    @Override
    public String toString()
    {
        return  getName() + " competes as a " + getCategory() + " Track & Field athlete and is in " + getGrade() + "th grade.";
    }

}