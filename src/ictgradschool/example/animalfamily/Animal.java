package ictgradschool.example.animalfamily;

public class Animal {
    protected int numLegs;
    protected String name;
    private boolean canFly;

    public Animal(){
        this.numLegs = 4;
        this.name = "animal";

        this.canFly = false;
    }

    public Animal(int numLegs, boolean canFly){
        this.numLegs = numLegs;
        this.canFly = canFly;

        this.name = "animal";
    }
    public Animal(int numLegs, boolean canFly, String name){
        this.numLegs = numLegs;
        this.canFly = canFly;

        this.name = name;
    }

    public int getNumLegs(){
        return this.numLegs;
    }

    public void sayHello(){
        System.out.println("...");
    }

    public String getName() {
        return this.name;
    }

    public void eat(Food food){
        System.out.println(getName() + " ate the " + food.getName());
    }

    public boolean getFlyStatus(){
        return this.canFly;
    }
}
