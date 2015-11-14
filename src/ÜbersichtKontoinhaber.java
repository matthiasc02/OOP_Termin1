
public class ÜbersichtKontoinhaber {

	public static void main(String[] args) {
		
		Konto maxmuster=new Konto("Max", "Muster");
		
		maxmuster.aufbuchen(100);
		System.out.println("Kontostand: "+ maxmuster.getKontostand());
		maxmuster.abbuchen(120);
		System.out.println("Kontostand: "+ maxmuster.getKontostand());
		maxmuster.aufbuchen(20);
		System.out.println("Kontostand: "+ maxmuster.getKontostand());
		maxmuster.abbuchen(120);
		System.out.println("Kontostand: "+ maxmuster.getKontostand());
	}

}
