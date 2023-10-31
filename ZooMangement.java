package tn.esprit.gestionzoo.main;

import java.util.Scanner;

import tn.esprit.gestionzoo.entities.*;


public class ZooMangement {

    public static void main(String[] args) {
        /*


        Scanner sc = new Scanner(System.in);
        System.out.print(" veuillez saisir le nombre de cages souhaité: ");
        int nbrCagesSaisie = sc.nextInt();

        tn.esprit.gestionzoo.main.ZooMangement zm1 = new tn.esprit.gestionzoo.main.ZooMangement();
        zm1.nbrCages = nbrCagesSaisie;
        zm1.zooName=" not my zoo";
        System.out.print(zm1.zooName + " comporte " + zm1.nbrCages + " cages ");
        Animal lion = new Animal("lion", "lion", 2, false);

        Zoo myZoo = new Zoo("myZoo", "tunis", 25);
        System.out.println(myZoo.toString());
        System.out.println(myZoo.addAnimal(lion));*/

        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana",10);
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana",12);


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


      //

        myZoo.displayZoo();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayZoo();


        System.out.println(myZoo);
/*
        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayZoo();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        System.out.println("--------------------------------------------------------------------");
        Aquatic aquatic = new Aquatic("Fish", "Sardine", 2, true, "Sea") {
            @Override
            public void swim() {

            }
        }
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);
        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        penguin.swim();
        dolphin.swim();
        aquatic.swim();





                Zoo zoo = new Zoo();

                try {
                    zoo.addAnimal(new Animal("Simba"));
                    System.out.println("Number of animals: " + zoo.getNbrAnimals());

                    zoo.addAnimal(new Animal("Melman"));
                    System.out.println("Number of animals: " + zoo.getNbrAnimals());

                    zoo.addAnimal(new Animal("Dumbo"));
                    System.out.println("Number of animals: " + zoo.getNbrAnimals());

                    // This will throw ZooFullException
                    zoo.addAnimal(new Animal("Shere Khan"));
                    System.out.println("Number of animals: " + zoo.getNbrAnimals());
                } catch (Zoo.ZooFullException e) {
                    System.err.println("Error: " + e.getMessage());
                }*/
        Terrestrial terrestrial = new Terrestrial("Panda", "Narla", 4, true, 2);

        terrestrial.eatPlantAndMeet(Food.PLANT);

        Dolphin dolphin = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 14.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Skipper", 3, true, "Ocean", 25.3f);

     penguin.eatMeat(Food.MEAT);
     dolphin.eatMeat(Food.MEAT);

    }

    }






