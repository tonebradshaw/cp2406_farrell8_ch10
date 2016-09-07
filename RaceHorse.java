/**
 * Created by tony on 4/09/2016.
 */
public class RaceHorse extends Horse{

    private int completedRaces;

    public RaceHorse(){

    }

    public RaceHorse(String name, String colour, int birthYear, int completedRaces){

        super(name, colour, birthYear);
        this.completedRaces = completedRaces;
    }
    public void setCompletedRaces(int completedRaces){

        this.completedRaces = completedRaces;
    }
    public int getCompletedRaces(){

        return completedRaces;
    }
    @Override
    public void display(){

        super.display();
        System.out.println(" and has completed " + completedRaces + " races");
    }
}
