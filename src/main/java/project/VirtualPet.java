package project;

public class VirtualPet {
    private String name;
    private int hunger = 10;

    public VirtualPet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public void eat() {
        hunger -= 10;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public void tick() {
        hunger += 2;
    }

    public String status(){
        return name + " | Hunger: " + hunger ;
    }
    @Override
    public String toString() {
        return name + " | Hunger: " + hunger ;

    }
}
