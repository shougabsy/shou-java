package tn.esprit.gestionzoo.entities;

public final class Terrestrial extends Animal implements Omnivore<Food>{
   private int nbrLegs;

    public Terrestrial(String fam, String nom, int ag, boolean ismml, int nbrLegs) {
        super(fam, nom, ag, ismml);
        this.nbrLegs = nbrLegs;
    }
    public Terrestrial(){
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString()+",nbrLegs"+ nbrLegs; }


    public void eatMeat(Object meat) {

    }

    @Override
    public void eatPlant(Object plant) {

    }

    @Override
    public void eatPlantAndMeet(Food food) {

    }
}

