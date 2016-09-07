/**
 * Created by tony on 4/09/2016.
 */
public class Poem {

    private String name;
    private int numberOfLines;

    public Poem(String name){

        this.name = name;
    }

    public Poem(String name, int numberOfLines){

        this.name = name;
        this.numberOfLines = numberOfLines;
    }
    public String getName(){

        return name;
    }
    public int getNumberOfLines(){

        return numberOfLines;
    }
    public void display(){

        System.out.println("The name is \"" + name + "\"");
    }
}
