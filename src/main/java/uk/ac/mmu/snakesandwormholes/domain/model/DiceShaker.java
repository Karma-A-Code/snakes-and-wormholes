package uk.ac.mmu.snakesandwormholes.domain.model;

public class DiceShaker {
public int diceValue;

    public DiceShaker() {
        int rolledValue = 0;
        rolledValue = (int)(Math.random()*6+1);
        diceValue = rolledValue;
    }
}
