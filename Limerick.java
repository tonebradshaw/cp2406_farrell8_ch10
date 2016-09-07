/**
 * Created by tony on 4/09/2016.
 */
public class Limerick extends Poem {

    final int NUMBEROFLINES;

    public Limerick(String name){

        super(name);
        NUMBEROFLINES = 5;
    }
    @Override
    public void display(){

        super.display();
        System.out.println("The number of lines is " + NUMBEROFLINES);
    }
}
