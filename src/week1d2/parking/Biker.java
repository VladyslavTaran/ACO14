package week1d2.parking;

public class Biker {
	public String name;
	public Moto moto;
	public int cash;
	
	public void buyMoto(Moto moto, int money){
		if (money <= cash){
			cash = cash - money;
			this.moto = moto;
			moto.owner = this;
		}else{
			System.out.println("Not enough money for " + moto.model);
		}
	}
	
	public void repairMoto(int money, int fix){
		if (moto != null){
			if (money <= cash){
				cash = cash - money;
				if ((moto.currentDurability + fix) >= moto.getDurability()){
					moto.currentDurability = moto.getDurability();
				}else{
					moto.currentDurability += fix;
				}
			}else{
				System.out.println(String.format("%s is not enough to fix %s on duration %s. At least &s is needed.", cash, moto.model, fix, money));
			}
		}
	}
	
	public void sellMoto(int cash){
		if (moto != null) {
			moto = null;
			this.cash += cash;
		}
	}
}
