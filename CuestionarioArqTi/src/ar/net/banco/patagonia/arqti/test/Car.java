package ar.net.banco.patagonia.arqti.test;

public class Car {

	private String id;
	private String brand;
	private int year;
	private String color;
	private int price;
	private boolean soldState;
	
	
	/*public Car(String randomId, String randomBrand, int randomYear,
			String randomColor, int randomPrice, boolean randomSoldState) {
		
	}*/


	public String getId() {
		return id;
	}


	public void setId(String randomId) {
		this.id = randomId;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String randomBrand) {
		this.brand = randomBrand;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int randomYear) {
		this.year = randomYear;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String randomColor) {
		this.color = randomColor;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int randomPrice) {
		this.price = randomPrice;
	}


	public boolean isSoldState() {
		return soldState;
	}


	public void setSoldState(boolean randomSoldState) {
		this.soldState = randomSoldState;
	}


	public Car(String randomId, String randomBrand, int randomYear,
			String randomColor, int randomPrice, boolean randomSoldState) {
		super();
		this.id = randomId;
		this.brand = randomBrand;
		this.year = randomYear;
		this.color = randomColor;
		this.price = randomPrice;
		this.soldState = randomSoldState;
	}

}
