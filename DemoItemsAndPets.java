/**
 * Created by tony on 4/09/2016.
 */
public class DemoItemsAndPets {

    public static void main(String[] args) {

        ItemSold cup = new ItemSold();
        ItemSold pot = new ItemSold();
        PetSold puppy = new PetSold();
        PetSold kitten = new PetSold();

        cup.setInvoiceNumber(143);
        cup.setDescription("food dish");
        cup.setPrice(12.99);
        cup.display();
        pot.setInvoiceNumber(144);
        pot.setDescription("water dish");
        pot.setPrice(10.99);
        pot.display();
        puppy.setInvoiceNumber(145);
        puppy.setDescription("dog");
        puppy.setPrice(1712.99);
        puppy.setVaccinated(true);
        puppy.display();
        kitten.setInvoiceNumber(146);
        kitten.setDescription("cat");
        kitten.setPrice(399.99);
        kitten.setVaccinated(true);
        kitten.setHousebroken(true);
        kitten.display();
    }
}
