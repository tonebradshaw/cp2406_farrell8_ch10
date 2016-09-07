/**
 * Created by tony on 4/09/2016.
 */
public class Haiku extends Poem{

    final int NUMBEROFLINES;

    public Haiku(String name){

        super(name);
        NUMBEROFLINES = 3;
    }
    @Override
    public void display(){

        super.display();
        System.out.println("The number of lines is " + NUMBEROFLINES);
    }
}
