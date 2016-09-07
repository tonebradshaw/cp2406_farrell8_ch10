/**
 * Created by tony on 4/09/2016.
 */
public class DemoHorse {

    public static void main(String[] args) {

        RaceHorse raceHorse = new RaceHorse("Blinky", "Brown", 2014, 5);
        RaceHorse brumby = new RaceHorse();

        raceHorse.display();
        raceHorse.setName("Gay Surprise");
        raceHorse.display();
        raceHorse.setCompletedRaces(6);
        raceHorse.setColour("grey and white");
        System.out.println(raceHorse.getName() + " is " + raceHorse.getColour() + " and has won 2 of the " +
                raceHorse.getCompletedRaces() + " races that she has entered");
        brumby.setName("Brumby");
        brumby.setColour("Chestnut");
        brumby.setBirthYear(2012);
        brumby.setCompletedRaces(2);
        brumby.display();
    }
}
