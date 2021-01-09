package ar.enums;

public class MoreEnums {
	
	enum Flavor {
		CHOCOLATE, VAINILLA, FRUTILLA;
		
		public static void getVainilla() {
			System.out.println(Flavor.VAINILLA);
		}
		public static void getCholocate() {
			System.out.println(Flavor.CHOCOLATE);
		}
	}

	public static void main(String[] args) {
		
		Flavor flav = Flavor.FRUTILLA;
		
		if(flav == flav.VAINILLA) {
			System.out.println("Es vainilla");
		} else if(flav == flav.CHOCOLATE) {
			System.out.println("Es chocolate");
		} else if(flav == flav.FRUTILLA) {
			System.out.println("Es frutilla");
		}
		
		
		flav.getVainilla();
		flav.getCholocate();
		
		

	}

}
