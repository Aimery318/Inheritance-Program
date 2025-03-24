/**
 * @author Aimery Dreux
 */
public class jumper extends trackAthlete{
    private String event;

    public jumper(String n, int g, String event)
    {
        super(n, "jumper", g);
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
        return  super.getName() + " competes as a " + super.getCategory() + " Track & Field athlete, specializes in " + getEvent() + " and is in " + super.getGrade() + "th grade.";
    }
}