/**
 * Created by tony on 4/09/2016.
 */
public class DebugTen4 {

    public static void main(String args[]){

        int id = 12241;
        String name = "Franklin";
        double credit = 1000.00;
        double purchase = 1325.77;

        DebugCustomerMakingPurchase cust = new
                DebugCustomerMakingPurchase(id, name, credit, purchase);
        cust.display();
    }
}
