package ictgradschool.example.animalfamily;

public class Cat extends Animal {
 /*   public Cat(){

        this.name = "cat";
    }*/

    public Cat(){
        super(4, false, "Cat");
    }

   @Override
    public void sayHello(){
        System.out.println("Meow");
    }


}
