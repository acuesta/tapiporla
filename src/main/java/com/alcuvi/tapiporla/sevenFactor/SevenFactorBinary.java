package com.alcuvi.tapiporla.sevenFactor;

import java.util.Random;

public class SevenFactorBinary implements SevenFactorI {

	public int rand7() {
		
		int throwOne = new Random().nextInt(5);
		int throwTwo = new Random().nextInt(5);
		int throwThree = new Random().nextInt(5);
		return 0;
	}

}
