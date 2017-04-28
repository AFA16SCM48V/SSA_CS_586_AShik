package dataStore;

public class DataStore1 extends DataStore {
	
	//those accessed from the outside are public
	
	int W; // Flag for Cash and Credit Payment Options
	int G; // Number of Gallons Needed 
	float price; // Price of gas 
	float totalPrice; // Total amount 
	float sprice;// Variable for keeping super gas price
	float rprice;// Variable for keeping regular gas price
	
	int g; // Quantity in gallons temp storage
	float total; // Total amount temp storage
	int w; // Temp flag for Cash and Credit

	public float temp_a; // Temp storage for super gas unit price
	public float temp_b; // Temporary Variable for regular gas unit price
	
	public float set_superprice()
	{
		return this.sprice = this.temp_a;
	}
	
	public float set_regularprice()
	{
		return this.rprice = this.temp_b;
	}
	
	public void set_W() {
		this.W = this.w;

	}

	public int get_W() {
		return this.W;
	}
	
	
	public void set_G(int g) {
		this.G = this.g;
	}

	public int get_G() {
		return this.G = this.G + 1;
	}
	
	public float get_Price() {
		return this.price;
	}
	
	public void set_sprice() {

		this.price = this.sprice;

	}
	
	public void set_rprice() {

		this.price = this.rprice;

	}
	public void set_Total(int total) {

		this.totalPrice = this.total;

	}

	public float get_Total() {
		// The total amount is  price * Quantity in Gallons)
		return this.total = this.price * this.G; 
	}
	
}
