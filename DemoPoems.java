/**
 * Created by tony on 4/09/2016.
 */
public class DemoPoems {

    public static void main(String[] args) {

        Poem poem = new Poem("Across the Ditch", 21);
        Couplet couplet = new Couplet("Away stranger");
        Limerick limerick = new Limerick("There once was a limerick");
        Haiku haiku = new Haiku("The tree");

        System.out.println( "\"" + poem.getName() + "\" has " + poem.getNumberOfLines() + " lines");
        couplet.display();
        limerick.display();
        haiku.display();
    }
}
