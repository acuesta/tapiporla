package com.alcuvi.tapiporla.sevenFactor;

public class sevenFactorTest {

	public void main(String [] args) {
		final SevenFactorI sevenFactor = new SevenFactorBinary();
		int random = sevenFactor.rand7();
	}
	
}
