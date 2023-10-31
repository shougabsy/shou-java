package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages;
    Aquatic[] aquaticAnimals;
    private int nbrAquatics;


    int nbrAnimals;

    public Zoo(String name, String city, final int nbrCages) {
        this.animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = 3;
        this.aquaticAnimals = new Aquatic[10];
    }


    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public boolean displayZoo() {
        System.out.println("name" + "city" + nbrCages);
        return false;
    }

    public void addAnimal(Animal animal) throws ZooFullException {
        if (searchAnimal(animal) != -1)
            //  return false;
            if (isZooFull())
                throw new ZooFullException();
        //  return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        //return true;
    }


    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("le nom ne peut pas etre vide");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }


    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return index;
    }

    boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    boolean isZooFull() {
        return nbrAnimals == nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public void addAquatic(Aquatic aquatic) {
        aquaticAnimals[nbrAquatics] = aquatic;
        nbrAquatics++;
    }// ajouter un aquatic dans le tableau aquaticAnimals

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0f;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                if (maxDepth < penguin.getSwimmingDelth())
                    maxDepth = penguin.getSwimmingDelth();
            }
        }
        return maxDepth;// cette méthode pour renvoyer la profondeur maximale des peinguins dans le zoo
    }

    public void displayNumberOfAquaticsByType() {
        int nbrPeinguins = 0;
        int nbrDolphins = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
                if (aquaticAnimals[i] instanceof Penguin) {
                    nbrPeinguins++;// instance of pour verifier que lobjet de mem type souhaités
                }

            }
        }
        System.out.println("le zoo" + name + "comporte" + nbrDolphins + "dophons" + nbrPeinguins + "peinguins");
    }

    public class ZooFullException extends Exception {
        public ZooFullException() {
            System.out.println("zoo complet");
        }

    }
}
      // PROSIT8









