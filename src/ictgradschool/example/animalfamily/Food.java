package ictgradschool.example.animalfamily;

public class Food {
    protected boolean isMeat;
    protected String name;

    public Food(String name, boolean isMeat){
        this.name = name;
        this.isMeat = isMeat;
    }

    public boolean isMeat(){
        return isMeat;
    }

    public String getName() {
        return name;
    }
}
