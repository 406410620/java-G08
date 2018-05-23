package rpg66;

import java.util.Random;

public class Dice {
	public Dice(){
		
	}
	
	public int toss(){
		Random rand = new Random();
		return rand.nextInt(6)+1;
	}
	
}
