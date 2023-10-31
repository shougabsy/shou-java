package tn.esprit.gestionzoo.entities;

public abstract non-sealed  class Aquatic extends Animal implements Carnivore<Food>  {
   protected String habitat;//abstract pour qu'on peut l'utiliser pour les methodes

    //abstract n'importe pas le méthodes seulement les classes qui heritent de cette classe mére
    public Aquatic(String fam, String nom, int ag, boolean ismml, String habitat) {
        super(fam, nom, ag, ismml);
        this.habitat = habitat;
    }

    public Aquatic(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic() {
    }

    public abstract void swim() ;// abstarct permet d'eheriter cette methode aux classes filles

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return aquatic.habitat.equals(habitat) && aquatic.getName().equals(super.getName()) && aquatic.getAge() == super.getAge();
        }
        return false;// cette methode pour compareer le nom l'age et labitat
    }


    @Override
    public String toString() { return super.toString()+"habitat"+habitat;
    }
    //PROSIT8


}
