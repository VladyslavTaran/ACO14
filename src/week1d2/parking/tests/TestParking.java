package week1d2.parking.tests;

import week1d2.parking.Moto;
import week1d2.parking.Parking;

public class TestParking {
	public static boolean testLastMoto(Parking parking, Moto moto){
		return (parking.takeLastMoto() == moto);
	}
	
	public static boolean testAddMotoOnLastFreePlace(Parking parking, Moto moto){
		return (parking.takeLastMoto() == moto);
	}
	
	public static boolean testTakeLastMoto(Parking parking, Moto moto){
		return (parking.takeLastMoto() == moto);
	}
	
	public static boolean testTakeMotoByPlaceNumber(Parking parking, int expectedVal, Moto moto){
		return (parking.takeMotoByPlaceNumber(expectedVal) == moto);
	}
}
