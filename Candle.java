/**
 * Created by tony on 5/09/2016.
 */
public class Candle {

    String colour;
    int height;

    public Candle(String colour, int height){

        this.colour = colour;
        this.height = height;
    }
    public void setColour(String colour){

        this.colour = colour;
    }
    public void setHeight(int height){

        this.height = height;
    }
    public String getColour(){

        return colour;
    }
    public int getHeight(){

        return height;
    }
    public double getPrice(){

        return height * 2;
    }

}
