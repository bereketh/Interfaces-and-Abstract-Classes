package com.bereket;

public class Main {

    public static void main(String[] args) {

        FightingMoves elf = new Elf("Dave");
        elf.highAttack();
        FightingMoves warrior = new Warrior("Rob");
        warrior.lowAttack();
        FightingMoves mage = new Mage("Sam");
        mage.distanceAttack();
        warrior.highAttack();
        mage.shortRangeAttack();
        elf.distanceAttack();
        warrior.shortRangeAttack();
    }
	/*
	  	/*
    		CHALLENGE
​
    		You're creating a video game where two players fight each other. In this
    		game there are different types of fighters.

    			- Mages - they use magic to fight
    			- Warriors - they fight with swords and shields
    			- Elves - they fight with bows and arrows and some magic
​
    		Create an abstract class called Character.
​
    			Give the class the following fields:
​
    				- character name
    				- number of wins
    				- number of losses
​
    			add these methods:
​
    				- constructor
    				- getters
    				- hasWon <-- this is an abstract method
    					- this method takes a boolean value
    					- When implementing this method in the sub-class,
    					  increment wins if true is passed, increment
    					  number of wins. If false is passed, increment
    					  number of losses.
​
			Create a FightingMoves interface with the following methods
​
				- highAttack()
				- lowAttack()
				- distanceAttack()
				- shortRangeAttack()
​
			Create classes for the 3 character types
​
				- Mage
				- Warrior
				- Elf
​
				These classes should inherit from the abstract class AND
				implement the interface.
​
				For the attacks, print some attack relevant to the character.
				For example, for the Elf's high attack:
​
					System.out.println(this.getName() + " slashes arrow at opponent's face"
    	*/

    }

