/**
 * @author Aimery Dreux
 */
public class sprinter extends trackAthlete{
    private String event;

    public sprinter(String n, int g, String event)
    {
        super(n, "sprinter", g);
        this.event = event;
    }

    public String getEvent()
    {
        return event;
    }

    public void setEvent(String n)
    {
        event = n;
    }

    @Override
    public String toString()
    {
        return  super.getName() + " competes as a " + super.getCategory() + " Track & Field athlete, specializes in the " + getEvent() + " and is in " + super.getGrade() + "th grade.";
    }
}