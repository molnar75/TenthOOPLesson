package tartalyos;

public class Tartaly extends Tarolo {

	private double pressure;
	
	public Tartaly(int terfogat, double pressure) {
		super(terfogat);
		this.pressure = pressure;
	}

	public boolean IsDangerous() {
		
		if((getVolume()*pressure)>100){
			return true;
		}
		return false;
	}

	public String toString() {
		return "Tartaly volume: " + getVolume() + ", pressure: " + pressure + ", dangerous: " + IsDangerous();
	}

	public boolean isBiggerThan(Tartaly tartaly){
		if(pressure > tartaly.getPressure()){
			return true;
		}
		return false;
	}

	public double getPressure() {
		return pressure;
	}
	
	public static Tartaly getBiggerTartaly(Tartaly tartaly, Tartaly tartaly2){
		
		if(tartaly.getVolume()>tartaly2.getVolume()){
			return tartaly;
		}
		
		return tartaly2;
	}
}
