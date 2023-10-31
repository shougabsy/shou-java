package tn.esprit.gestionzoo.entities;

public sealed class Animal permits Terrestrial ,Aquatic {
    String family;
    String name;
    int age;
    boolean isMammal;// seald elle donne la permission de 2 classes avec permits "nom de 2 classes "


    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public Animal(String fam, String nom, int ag, boolean ismml) {
        this.family = fam;
        this.name = nom;
        this.age = ag;
        this.isMammal = ismml;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0)
            System.out.println("lage ne peut pas etre negatif");
        else
        this.age = age;
    }

    public boolean isMammal() {
        return isMammal;
    }



    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public Animal(){

    }
}