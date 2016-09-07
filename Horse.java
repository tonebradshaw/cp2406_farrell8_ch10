/**
 * Created by tony on 4/09/2016.
 */
public class Horse {

    private String name;
    private String colour;
    private int birthYear;

    public Horse(){

    }
    public Horse(String name, String colour, int birthYear){

        this.name = name;
        this.colour = colour;
        this.birthYear = birthYear;
    }
    public void setName(String name){

        this.name = name;
    }
    public void setColour(String colour){

        this.colour = colour;
    }
    public void setBirthYear(int birthYear){

        this.birthYear = birthYear;
    }
    public String getName(){

        return name;
    }
    public String getColour(){

        return colour;
    }
    public int getBirthYear(){

        return birthYear;
    }
    public void display(){

        System.out.print("The horse's name is " + name + ", colour is " + colour + ", birth Year is " + birthYear);
    }
}
