package br.cursoemvideo.class4;

public class main {

	public static void main(String[] args) {
	Pen blue = new Pen("Bic", "Blue", 0.5f);
	Pen red = new Pen("Bic", "Red", 1.0f);
	
	blue.status();
	System.out.println("------------------------------------------");
	red.status();
	System.out.println("------------------------------------------");
	blue.setColor("green");
	blue.capped();
	System.out.println( "Capped: " + blue.getCapped());
	System.out.println( "Color: " + blue.getColor());

	}

}
