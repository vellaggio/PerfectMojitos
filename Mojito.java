package mojitos;

public class Mojito {

	private double lima, lima_natural, sucre, gaseosa, menta, ron;
	private int points;
	//lima = l, lima_natural = unitats, sucre = culleradetes, gaseosa=l, menta=fulles, ron=l

	public Mojito(double lima, double lima_natural, double sucre,
			double gaseosa, double menta, double ron) {
		super();
		this.lima = lima;
		this.lima_natural = lima_natural;
		this.sucre = sucre;
		this.gaseosa = gaseosa;
		this.menta = menta;
		this.ron = ron;
	}



	public double getLima() {
		return lima;
	}



	public void setLima(double lima) {
		this.lima = lima;
	}



	public double getLima_natural() {
		return lima_natural;
	}



	public void setLima_natural(double lima_natural) {
		this.lima_natural = lima_natural;
	}



	public double getSucre() {
		return sucre;
	}



	public void setSucre(double sucre) {
		this.sucre = sucre;
	}



	public double getGaseosa() {
		return gaseosa;
	}



	public void setGaseosa(double gaseosa) {
		this.gaseosa = gaseosa;
	}



	public double getMenta() {
		return menta;
	}



	public void setMenta(double menta) {
		this.menta = menta;
	}



	public double getRon() {
		return ron;
	}



	public void setRon(double ron) {
		this.ron = ron;
	}



	public int getPoints() {
		return points;
	}



	public void setPoints(int points) {
		this.points = points;
	}
	
	public void print(){
		System.out.println("-------------------");
		System.out.println("Mojito format per:");
		System.out.println(ron +"litres de ron");
		System.out.println(gaseosa +"litres de gaseosa");
		System.out.println(lima +"litres de lima");
		System.out.println(lima_natural +"unitats de lima natural");
		System.out.println(menta +"fulles de menta");
		System.out.println(sucre +"cullerades de sucre");		
	}
	
}
