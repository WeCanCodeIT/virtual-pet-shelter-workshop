package project;

public class VirtualPet {
    private String petName;
    private int hunger = 10;

    public VirtualPet(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
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
}
