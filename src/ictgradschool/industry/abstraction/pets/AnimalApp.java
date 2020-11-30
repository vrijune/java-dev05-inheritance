package ictgradschool.industry.abstraction.pets;

import ictgradschool.example.animalfamily.Animal;

/**
 * Main program.
 */
public class AnimalApp {


    public void start() {

        IAnimal[] animals = new IAnimal[3];

        // TODO Populate the pets array with a Bird, a Dog and a Horse.

        animals[0] = new Bird();
        animals[1] = new Dog();
        animals[2] = new Horse();

        processAnimalDetails(animals);

    }

    private void processAnimalDetails(IAnimal[] list) {
        // TODO Loop through all the pets in the given list, and print their details as shown in the lab handout.
        // TODO If the animal also implements IFamous, print out that corresponding info too.



        for(int i = 0; i < 3; i++){
               System.out.println(list[i].myName() + " says " + list[i].sayHello() + ".");

               if (list[i].isMammal())
                   System.out.println(list[i].myName() + " is a mammal" + ".");
               else
                   System.out.println(list[i].myName() + " is a non-mammal"+ ".");




               System.out.println("Did i forget to tell you that I have "+ list[i].legCount() + " legs.");

               if(list[i] instanceof IFamous)
                   System.out.println(" This is a famous name of my favour type: PharLap");
           }


        }






    public static void main(String[] args) {
        new AnimalApp().start();
    }
}
