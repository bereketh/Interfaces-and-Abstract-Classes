package com.bereket;

public class Mage extends Character implements FightingMoves {
    public Mage (String characterName){
        super(characterName);
    }
    @Override
    public boolean hasWon() {
        if (hasWon()) {
            numberOfWins++;
        } else {
            NumberOfLosses++;
        }
        return hasWon();
    }

    @Override
    public void highAttack() {
        System.out.println(this.getCharacterName() + " jumps and kicks opponent's face");

    }

    @Override
    public void lowAttack() {
        System.out.println(this.getCharacterName() + " slides and kicks at opponent's ankles");

    }

    @Override
    public void distanceAttack() {
        System.out.println(this.getCharacterName() + " from a distance, Mage kicks the opponent");

    }

    @Override
    public void shortRangeAttack() {
        System.out.println(this.getCharacterName() + " jumps high towards opponent, kicks opponent in head");

    }
}
