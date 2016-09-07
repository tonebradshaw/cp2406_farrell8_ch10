import javax.swing.*;

/**
 * Created by tony on 4/09/2016.
 */
public class DebugPhoneBook extends DebugBook{

    private String area;
    private String size;
    private final int CUTOFF = 30;

    DebugPhoneBook(int pages, String city){

        super(pages);
        area = city;
        if(pages > CUTOFF)
            size = "big";
        else
            size = "small";
    }
    public void display(){

        JOptionPane.showMessageDialog(null, "The phone book for " + area +
                " has " + pages + " pages.\nThat is a " +
                size + " phone book.");
    }
}