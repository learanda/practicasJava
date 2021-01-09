package ar.oop;

public class Auriculares {
	
	String carga = "Micro USB";
	String[] controles = {"power", "volume", "back", "next", "play/pause"};
	String color = "Rojo/Negro";
	
	static boolean power = false;
	static int volume = 0;
	
	public static void powerOn() {
		power = true;
	}
	
	public static void powerOff() {
		power = false;
	}
	
	public static void volumeUp() {
		volume++;
	}
	
	public static void volumeDown() {
		volume--;
	}

}
