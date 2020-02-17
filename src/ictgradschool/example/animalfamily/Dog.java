package ictgradschool.example.animalfamily;

public class Dog extends Animal{
    public Dog(){
        super();
        this.name = "dog";
    }

    @Override
    public void sayHello(){
        System.out.println("Woof");
    }
}
