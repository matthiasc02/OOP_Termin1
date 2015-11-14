
public class Konto {
	
	private String Kontoinhaber;
	private double Kontostand;
	
	public Konto (String Vorname, String Nachname)
	{
		Kontoinhaber=Vorname+Nachname;
	}
	
	public void aufbuchen(double Wert){
		Kontostand+=Wert;
	}
	
	public void abbuchen(double Wert){
		Kontostand-=Wert;
		if (Kontostand<0)
		{
			System.out.println("Das ist nicht Möglich!! Der Wert ist zu hoch");
			Kontostand+=Wert;
		}
	}
	public double getKontostand(){
		return Kontostand;
	}

}
