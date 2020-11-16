package br.cursoemvideo.class4;

public class Pen {
	private String model;
	private String Color;
	private float tip;
	private int load;
	private boolean capped;
	
	public Pen(String model, String color, float tip) {
		setModel(model);
		setColor(color);
		setTip(tip);
		setLoad(100);
		setCapped(true);
	}
	
	public void capped() {
		setCapped(true);
	}
	
	public void unCapped() {
		setCapped(false);
	}
	
	public void scrible() {
		System.out.println("Scribbled");
	}
	
	public void write() {
		System.out.println("Writing");
	}
	
	public void status() {
		System.out.println("Model: " + getModel());
		System.out.println("Color: " + getColor());
		System.out.println("Tip: " + getTip());
		System.out.println( "Load: " + getLoad() + "%");
		System.out.println( "Capped: " + getCapped());
	}
	
	public String getModel () {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return this.Color;
	}
	
	public void setColor (String color) {
		this.Color = color;
	}
	
	public float getTip () {
		return this.tip;
	}
	
	public void setTip(float tip) {
		this.tip = tip;
	}
	
	public int getLoad() {
		return this.load;
	}
	
	public void setLoad(int load) {
		this.load = load;
	}
	
	public boolean getCapped() {
		return this.capped;
	}
	
	public void setCapped(boolean capped) {
		this.capped = capped;
	}
}
