package tartalyos.fut;

import tartalyos.Tartaly;

public class Proba {

	public static void main(String[] args) {
		Tartaly[] tartalyArray = new Tartaly[5];
		
		for(int i=0; i<tartalyArray.length; i++){
			tartalyArray[i]=new Tartaly(3*i, 6*i);
		}
		
		for (Tartaly tartaly : tartalyArray) {
			System.out.println(tartaly);
		}
		
		int maxPressure = 0;
		for (int i = 1;  i< tartalyArray.length; i++) {
			if(tartalyArray[i].isBiggerThan(tartalyArray[maxPressure])){
				maxPressure = i; 
			}
		}
		System.out.println("Max pressure: "+tartalyArray[maxPressure]);
		Tartaly maxTartaly = tartalyArray[0];
		
		for (int i = 1; i < tartalyArray.length; i++) {
			if(maxTartaly.getVolume() < tartalyArray[i].getVolume()){
				maxTartaly = tartalyArray[i];
			}
		}
		System.out.println("Max volume: " + maxTartaly);
	}

}
