package week1d2.parking;

public class Parking {
	private Moto[] motoes;
	public int placesAmount;
	private boolean closed = false;

	Parking(int motoesCount){
		this.motoes = new Moto[motoesCount];
		placesAmount = motoesCount;
	}
	
	public void addByPlaceNumber(int placeNumber, Moto moto){
		if ((motoes[placeNumber] != null) && (placeNumber < motoes.length)){
			motoes[placeNumber] = moto;
		}else{
			System.out.println(String.format("Stated place number %s is not free or more than places amount(%s)", placeNumber, placesAmount));
		}
	}
	
	public int addMotoOnLastFreePlace(Moto moto){
		int lastFP;
		lastFP = getLastFreePlace();
		if (lastFP > -1){
			addByPlaceNumber(getLastFreePlace(), moto);
		};
		return lastFP;
	}
	
	private int getLastFreePlace(){
		int freePlaceNumber = -1;
		for (int i = 0; i < placesAmount; i++){
			if(motoes[i] == null){
				freePlaceNumber = i;
			}
		}
		return freePlaceNumber;
	}
	
	public Moto takeLastMoto(){
		Moto moto = null;
		for (int i = placesAmount - 1; i >= 0; i--){
			if (motoes[i] != null){
				moto = motoes[i];
			}
		}
		return moto;
	}
	
	public void showAllInGarage(){
		for (int i = 0; i < placesAmount; i++){
			if (motoes[i] != null){
				System.out.println(String.format("%s. %s", i, motoes[i].model));
			}
		}
	}
	
	public Moto takeMotoByPlaceNumber(int placeNumber){
		Moto moto = null;
		if (placeNumber < placesAmount){
			if(motoes[placeNumber] != null){
				moto = motoes[placeNumber];
			}
		}
		return moto;
	}
	
	public void close(){
		closed = true;
	}
	
	public void open (){
		closed = false;
	}
	 	
	public boolean ifClosed(){
		return closed;
	}
}
