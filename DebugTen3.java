import javax.swing.*;

/**
 * Created by tony on 4/09/2016.
 */
public class DebugTen3 {

    public static void main(String[] args)
    {
        String area, inStr;
        int pages;
        area = JOptionPane.showInputDialog(null,
                "Enter city for phone book");
        inStr = JOptionPane.showInputDialog(null,
                "Enter number of pages in " + area + "'s phone book");
        pages = Integer.parseInt(inStr);
        DebugPhoneBook pb = new DebugPhoneBook(pages, area);
        pb.display();
    }
}
