/**
 * @author Aimery Dreux
 */
public class longDistanceRunner extends trackAthlete{
    private String event;

    public longDistanceRunner(String n, int g, String event)
    {
        super(n, "long distance runner", g);
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