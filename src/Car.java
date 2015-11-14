
public class Car {

	public int CurrentGear;
	public int CurrentSpeed;
	public String Colour;
	public String Brand;
	public int Year;

	public void nextGear() {
		CurrentGear++;
	}

	public void setCurrentGear(int newGear) {	
		CurrentGear = newGear;
	}
	
	public void accalerate(){
		CurrentSpeed +=10;
	}
	
	public void accalerate(int customSpeed){
		CurrentSpeed +=customSpeed;
	}

}
