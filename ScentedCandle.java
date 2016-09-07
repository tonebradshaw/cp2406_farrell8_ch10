/**
 * Created by tony on 5/09/2016.
 */
public class ScentedCandle extends Candle {

    public ScentedCandle(String colour, int height){

        super(colour, height);
    }
    @Override
    public double getPrice(){

        return height * 3;
    }
}
