package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
  private float swimmingDelth;

    public Penguin(String fam, String nom, int ag, boolean ismml, String habitat, float swimmingDelth) {
        super(fam, nom, ag, ismml, habitat);
        this.swimmingDelth = swimmingDelth;
    }
    public Penguin (){

    }

    public float getSwimmingDelth() {
        return swimmingDelth;
    }

    public void setSwimmingDelth(float swimmingDelth) {
        this.swimmingDelth = swimmingDelth;
    }
    @Override
    public void swim() {
        System.out.println("A penguin is swimming");
    }

    @Override
    public String toString() { return super.toString()+"swimmingDelth"+swimmingDelth;
    }

    @Override
    public  void eatMeat(Food meat) {

    }
}
