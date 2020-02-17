package ictgradschool.example.animalfamily;

public class Tyrannosaurus extends Animal {

    public Tyrannosaurus(){
        super();
        this.name = "tRex";
    }

    @Override
    public void sayHello() {
        System.out.println("RAWR");
    }

    @Override
    public void eat(Food food) {
        if(food.isMeat()) {
            super.eat(food);
        } else {
            System.out.println(getName() + " spat out the " + food.getName());
        }
    }
}
