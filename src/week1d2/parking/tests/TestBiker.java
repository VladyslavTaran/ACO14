package week1d2.parking.tests;

import week1d2.parking.Biker;
import week1d2.parking.Moto;

public class TestBiker {
	public static boolean testBuyMoto(Biker biker, Moto moto){
		return (biker.moto == moto);
	}
	
	public static boolean testRepairMoto(Biker biker, int repairVal){
		return ((biker.moto.currentDurability + repairVal) == biker.moto.getDurability());
	}
	
	public static boolean testSellBike(Biker biker){
		return (biker.moto == null);
	}
}
