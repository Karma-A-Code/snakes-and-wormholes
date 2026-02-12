package uk.ac.mmu.snakesandwormholes;

import uk.ac.mmu.snakesandwormholes.domain.model.DiceShaker;

public class App {
    static void main() {

        DiceShaker die = new DiceShaker();
        IO.println("die value " + die.diceValue);
    }
}
