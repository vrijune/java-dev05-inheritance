package ictgradschool.example.animalfamily;

public class AnimalDayCare {
    public static void main(String[] args) {
        Centipede centipede = new Centipede(true);
        System.out.println(centipede.getNumLegs());
        System.out.println(centipede.isVenemous());
        System.out.println();
        System.out.println();

        Animal centipede2 = new Centipede(true);
        System.out.println(centipede2.getNumLegs());
        if(centipede2 instanceof Centipede){
            Centipede c = (Centipede)centipede2;
            System.out.println(((Centipede)centipede2).isVenemous());
        }
        System.out.println(centipede2 instanceof Cat);

        //Inheritance & method override
        System.out.println("Understand method override.");
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal c2 = new Cat();

        animal.sayHello();
        cat.sayHello();
        dog.sayHello();
        c2.sayHello();
        System.out.println();

        // Reference type & Polymorphism
        System.out.println("Reference type & Polymorphism example");
        System.out.println("The following output should be same as above.");
        Animal animal1 = new Animal();
        Cat animal2 = new Cat();
        Animal animal3 = new Dog();
        animal1.sayHello();
        animal2.sayHello();
        animal3.sayHello();
        System.out.println();

        // reference type and use of array
        System.out.println("Reference type and use of array");
        Animal[] animals = new Animal[3];
        animals[0] = animal1;
        animals[1] = new Centipede(true);
        animals[2] = animal3;
        for(int i = 0; i < animals.length; i++){
            animals[i].sayHello();
        }

        System.out.println();
        System.out.println();


        System.out.println("Polymorphism example2");
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        AnimalDayCare daycare = new AnimalDayCare();
        daycare.deposit(cat1);
        daycare.deposit(dog1);
        System.out.println();
        System.out.println();


        //Use methods from super class
        System.out.println("Use methods from the superclass in its subclass");
        Tyrannosaurus tRex = new Tyrannosaurus();
        Food pork = new Food("pork", true);
        tRex.eat(pork);
        Food grass = new Food("grass", false);
        tRex.eat(grass);
        System.out.println();
        System.out.println();


        // Constructor of superclass
        System.out.println("Constructor of the superclass must be called by its subclass.");
        Cat kitty = new Cat();
        Bird kiwi = new Bird(false);
        Bird eagle = new Bird(true);

        System.out.println(kitty.getName() + " has " + kitty.getNumLegs() + " legs.");
        System.out.println(kiwi.getName() + " has " + kiwi.getNumLegs() + " legs.");
        System.out.println(eagle.getName() + " has " + eagle.getNumLegs() + " legs.");
        System.out.println("Can kitty fly? Ans: " + kitty.getFlyStatus());
        System.out.println("Can kiwi fly? Ans: " + kiwi.getFlyStatus());
        System.out.println("Can eagle fly? Ans: " + eagle.getFlyStatus());
        System.out.println();

    }

    public void deposit(Animal animal){
        System.out.println("You deposited your " + animal.getName());
        System.out.print("It said: ");
        animal.sayHello();
    }


}
