/**
 * Created by tony on 4/09/2016.
 */
public class ItemSold {

    private int invoiceNumber;
    private String description;
    private double price;
    private String name;

    public ItemSold(){

        name = "Francis Pet Supply";
    }
    public void setInvoiceNumber(int invoiceNumber){

        this.invoiceNumber = invoiceNumber;
    }
    public void setDescription(String description){

        this.description = description;
    }
    public void setPrice(double price){

        this.price = price;
    }
    public int getInvoiceNumber(){

        return invoiceNumber;
    }
    public String getDescription(){

        return description;
    }
    public double getPrice(){

        return price;
    }
    public String getName(){

        return name;
    }
    public void display(){

        System.out.println("Business name - " + name + ", invoice number - " + invoiceNumber +
            " description - " + description + ", price - $" + price);
    }
}
