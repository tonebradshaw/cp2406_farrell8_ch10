/**
 * Created by tony on 4/09/2016.
 */
public class DebugTen2 {

    public static void main(String args[])
    {
        DebugVacation myVacation = new DebugVacation();
        DebugExtendedVacation yourVacation =
                new DebugExtendedVacation();
        System.out.println("My vacation is for " +
                myVacation.getDays() + " days");
        System.out.println("Your vacation is for " +
                yourVacation.getDays() + " days");
    }
}
