package com.bereket;

public class Elf extends Character implements FightingMoves {
    public Elf(String characterName) {
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
        System.out.println(this.getCharacterName() + " slides and kicks opponent's face");

    }

    @Override
    public void distanceAttack() {
        System.out.println(this.getCharacterName() + " flips and kicks opponent's head");

    }

    @Override
    public void shortRangeAttack() {
        System.out.println(this.getCharacterName() + " jumps towards opponent and kicks them in chest");

    }
}