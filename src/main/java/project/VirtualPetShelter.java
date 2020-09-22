package project;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, VirtualPet> pets = new HashMap<>();

    public void addPet(VirtualPet petToAdd) {
        pets.put(petToAdd.getName(), petToAdd);
    }

    public void removePet(String petName) {
        pets.remove(petName);
    }

    public void feedAllPets() {
        for (VirtualPet petToFeed : pets.values()) {
            petToFeed.eat();
        }
    }

    public void tickAllPets(){
        for (VirtualPet petToTick : pets.values()){
            petToTick.tick();
        }
    }

    public Collection<VirtualPet> retrievePets(){
        return pets.values();
    }

    public VirtualPet retrievePet(String petName){
        return pets.get(petName);
    }

}
