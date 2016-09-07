/**
 * Created by tony on 4/09/2016.
 */
public class Couplet extends Poem {

    final int NUMBEROFLINES;

    public Couplet(String name){

        super(name);
        NUMBEROFLINES = 2;
    }
    @Override
    public void display(){

        super.display();
        System.out.println("The number of lines is " + NUMBEROFLINES);
    }
}
