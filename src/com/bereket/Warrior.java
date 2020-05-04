package com.bereket;

public class Warrior extends Character implements FightingMoves {
    public Warrior (String characterName){
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
        System.out.println(this.getCharacterName() + " slashes arrow at opponent's face");

    }

    @Override
    public void lowAttack() {
        System.out.println(this.getCharacterName() + " slides and kicks opponents legs");

    }

    @Override
    public void distanceAttack() {
        System.out.println(this.getCharacterName() + " jumps back and kicks opponent");

    }

    @Override
    public void shortRangeAttack() {
        System.out.println(this.getCharacterName() + " runs up and kicks opponent head");

    }
}
