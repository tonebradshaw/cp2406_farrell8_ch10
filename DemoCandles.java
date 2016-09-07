/**
 * Created by tony on 5/09/2016.
 */
public class DemoCandles {

    public static void main(String[] args) {

        Candle candle = new Candle("blue", 8);
        ScentedCandle scentedCandle = new ScentedCandle("red", 4);

        System.out.println("The candle's colour is " + candle.getColour() + " and at " + candle.getHeight()
                + " inches long, the price is $" + String.format("%.2f", candle.getPrice()));
        System.out.println("The scented candle's colour is " + scentedCandle.getColour() + " and at " + scentedCandle.getHeight()
                + " inches long, the price is $" + String.format("%.2f", scentedCandle.getPrice()));

        candle.setHeight(9);
        candle.setColour("yellow");
        scentedCandle.setHeight(6);
        scentedCandle.setColour("white");

        System.out.println("\nThe candle's colour is " + candle.getColour() + " and at " + candle.getHeight()
                + " inches long, the price is $" + String.format("%.2f", candle.getPrice()));
        System.out.println("The scented candle's colour is " + scentedCandle.getColour() + " and at " + scentedCandle.getHeight()
                + " inches long, the price is $" + String.format("%.2f", scentedCandle.getPrice()));
    }
}
