public class thrower extends trackAthlete{
    private String event;

    public thrower(String n, int g, String event)
    {
        super(n, "thrower", g);
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