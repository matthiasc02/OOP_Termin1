
public class Demo {

	public static void main(String[] args) {

		int n;
		Car porsche911 = new Car();
		porsche911.Brand = "Porsche";
		porsche911.Colour = "black";
		porsche911.Year = 1979;
		porsche911.setCurrentGear(1);		
		
		porsche911.accalerate(30);
		System.out.println("Du verwendest den Gang: "+porsche911.CurrentGear);
		System.out.println("Du fährst: "+porsche911.CurrentSpeed);
		porsche911.nextGear();
		porsche911.accalerate(35);
		System.out.println("Du verwendest den Gang: "+porsche911.CurrentGear);
		System.out.println("Du fährst: "+porsche911.CurrentSpeed);
		
		
		
		Car golf5 = new Car();
		golf5.Brand = "VW";
		golf5.Colour = "green";
		golf5.Year = 2012;

		Waehrungsbetrag chfBetrag = new Waehrungsbetrag();
		chfBetrag.Wert = 500;
		chfBetrag.Zeichen = "CHF";

	}

}
