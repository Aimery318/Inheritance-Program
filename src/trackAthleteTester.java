/**
 * @author Aimery Dreux
 */
import java.util.*;
public class trackAthleteTester {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<trackAthlete> runners = new ArrayList<>();
        while (true)
        {
            System.out.println("Enter your name: ('exit' to quit)");
            String name = in.next();
            in.nextLine();
            if (name.equals("exit"))
            {
                break;
            }
            System.out.println("Enter your track and field event category: (long distance runner, sprinter, jumper, thrower)");
            String category = in.nextLine();
            System.out.println("Enter your grade: ");
            int grade = in.nextInt();
            in.nextLine();
            System.out.println("Enter your event: ");
            String event = in.nextLine();
            if (category.equals("long distance runner"))
            {
                trackAthlete a = new longDistanceRunner(name, grade, event);
                runners.add(a);
            }
            if (category.equals("sprinter"))
            {
                trackAthlete a = new sprinter(name, grade, event);
                runners.add(a);
            }
            if (category.equals("jumper"))
            {
                trackAthlete a = new jumper(name, grade, event);
                runners.add(a);
            }
            if (category.equals("thrower"))
            {
                trackAthlete a = new thrower(name, grade, event);
                runners.add(a);
            }
        }

        for (trackAthlete i: runners)
        {
            System.out.println(i);
        }
    }
}
