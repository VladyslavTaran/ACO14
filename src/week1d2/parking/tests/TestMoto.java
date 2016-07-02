package week1d2.parking.tests;

import week1d2.parking.Moto;

public class TestMoto {
	public static boolean testDuration(Moto moto, int expectedValue){
		return (moto.currentDurability == expectedValue);
	}
}
