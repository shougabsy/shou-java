package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
   private float swimmingSpeed;

    public Dolphin(String fam, String nom, int ag, boolean ismml, String habitat, float swimmingSpeed) {
        super(fam, nom, ag, ismml, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public Dolphin(){

    }
    public void swim(){
        System.out.println("the dolphin is swimming");
    }
    @Override
    public String toString() { return super.toString()+"swimmingSpeed"+swimmingSpeed;
    }


    public  void eatMeat(Food meat) {

    }
}
