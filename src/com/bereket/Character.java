package com.bereket;

public abstract class Character {
    private String characterName;
    public int numberOfWins = 0;
    public int NumberOfLosses = 0;

    public Character(String characterName) {
        this.characterName = characterName;

    }
    public abstract boolean hasWon();



    public String getCharacterName() {
        return characterName;
    }


}
