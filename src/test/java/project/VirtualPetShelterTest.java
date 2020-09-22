package project;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class VirtualPetShelterTest {

    /*
    To Do List:
    - Able to add pets
    - Able to remove a specific pet from shelter given it's name
    - Able to feed all pets in the shelter.
    - Able to tick all pets.
    - Return list of pets in shelter.
     */
    @Test
    public void shouldBeAbleToAddPet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Testy");
        underTest.addPet(testPet);
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(1)
                        .contains(testPet);
    }

    @Test
    public void shouldBeAbleToRemoveAPet(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Testy");
        underTest.addPet(testPet);
        underTest.removePet(testPet.getName());
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(0)
                .isEmpty();
    }
    @Test
    public void shouldBeAbleToFeedAllPets(){
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new VirtualPet("Testy");
        VirtualPet anotherTestPet = new VirtualPet("Tester");
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);

        underTest.feedAllPets();

        assertThat(testPet.getHunger()).isEqualTo(0);
        assertThat(anotherTestPet.getHunger()).isEqualTo(0);
    }
}
