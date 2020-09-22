package project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VirtualPetTest {

    private VirtualPet underTest;

    @BeforeEach
    void setUp() {
        underTest = new VirtualPet("Testy");
    }

    @Test
    public void feedingPetShouldDecreaseHungerByTen() {
        int initialHunger = underTest.getHunger();

        underTest.eat();

        int postEatingHunger = underTest.getHunger();
        assertThat(initialHunger - postEatingHunger).isEqualTo(10);
    }

    @Test
    public void feedingAPetShouldNeverLowerHungerBelowZero() {
        for (int i = 0; i < 1000; i++) {
            underTest.eat();
        }

        assertThat(underTest.getHunger()).isGreaterThanOrEqualTo(0);
    }

    @Test
    public void tickShouldIncreaseHungerByTwo() {
        int initialHunger = underTest.getHunger();

        underTest.tick();

        int postTickHunger = underTest.getHunger();
        assertThat(postTickHunger - initialHunger).isEqualTo(2);
    }

}
