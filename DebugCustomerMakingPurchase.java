/**
 * Created by tony on 4/09/2016.
 */
public class DebugCustomerMakingPurchase extends DebugCustomer{


    private double amountOfPurchase;
    private boolean overLimit;

    public DebugCustomerMakingPurchase(int idNumber, String name, double creditLimit, double purchAmount){

        super(idNumber, name, creditLimit);
        amountOfPurchase = purchAmount;
        if(amountOfPurchase > creditLimit)
            overLimit = true;
        else
            overLimit = false;
    }
    @Override
    public void display(){

        super.display();
        System.out.println("Purchase amount $" + amountOfPurchase);
        if(overLimit)
            System.out.println("****Credit denied - customer over limit");
        else
            System.out.println("Purchase Okay");
    }
}
