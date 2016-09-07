/**
 * Created by tony on 4/09/2016.
 */
public class PetSold extends ItemSold{

    Boolean vaccinated, neutered, housebroken;

    PetSold(){

        vaccinated = false;
        neutered = false;
        housebroken = false;
    }

    public void setVaccinated(Boolean vaccinated) {

        this.vaccinated = vaccinated;
    }
    public void setNeutered(Boolean neutered){

        this.neutered = neutered;
    }
    public void setHousebroken(Boolean housebroken){

        this.housebroken = housebroken;
    }
    public Boolean getVaccinated() {

        return vaccinated;
    }
    public Boolean getNeutered(){

        return neutered;
    }
    public Boolean getHousebroken(){

        return housebroken;
    }
    public void display(){

        super.display();
        System.out.println("Your pet has " + ((!vaccinated) ? "not " : "") + "been vaccinated, has " +
                ((!neutered) ? "not" : "") + " been neutered and has " +
                ((!housebroken) ? "not " : "") + "been house broken");
    }
}
