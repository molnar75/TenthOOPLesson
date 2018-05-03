package tartalyos;

public abstract class Tarolo {

	private int volume;

	public Tarolo(int volume) {
		super();
		this.volume = volume;
	}
	
	public abstract boolean IsDangerous();

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
