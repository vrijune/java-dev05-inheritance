package ictgradschool.industry.abstraction.pets;

/**
 * Represents a horse.
 *
 * TODO Make this implement IAnimal and IFamous, and provide appropriate implementations of those methods.
 */
public class Horse implements IAnimal, IFamous{
    @Override
    public String sayHello() {
        return "neigh";
    }

    @Override
    public boolean isMammal() {
        return true;
    }

    @Override
    public String myName() {
        return "Mr. Ed the horse";
    }

    @Override
    public int legCount() {
        return 4;
    }

    @Override
    public String famous() {
        return "PharLap";
    }
}
