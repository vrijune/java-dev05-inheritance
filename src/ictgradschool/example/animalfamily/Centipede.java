package ictgradschool.example.animalfamily;

public class Centipede extends Animal {
    private boolean isVenemous;

    public Centipede(boolean isVenemous){
        //this.numLegs = 100;
        this.isVenemous = isVenemous;
    }

    public boolean isVenemous(){
        return this.isVenemous;
    }
}
