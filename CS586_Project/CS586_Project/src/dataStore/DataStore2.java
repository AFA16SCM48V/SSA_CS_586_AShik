package dataStore;

public class DataStore2 extends DataStore {

	//those accessed from the outside are public
	
	public int temp_a;
	public int temp_b;
	public int temp_c;
	
	int pprice;
	int sprice;
	int rprice;
	public int Price;
	public int total;
	int Total;
	int l;
	public int L;
	int w;
	int W;
	public int temp_cash;
	public int cash;
	
	public int set_premium_price()
	{
		 return this.pprice = this.temp_a;
	}
	
	public int set_super_price()
	{
		return this.sprice = this.temp_b;
	}
	
	public int set_regular_price()
	{
		return  rprice = this.temp_c;
	}
	
	public void set_pprice()
	{
		this.Price = this.pprice;
	}
	
	public void set_sprice()
	{
		this.Price = this.sprice;
	}
	
	public void set_rprice()
	{
		this.Price = this.rprice;
	}
	
	public void set_Total(int total) {

		this.Total = this.total;

	}

	public int get_Total() {
		// The total amount is price * Quantity in Liters
		return this.total = this.Price * this.L;
	}
	
	public int set_L(int l) {
		return this.L = this.l;
	}

	public int get_L() {

		return this.L = this.L + 1;

	}
	
	public void set_W() {
		this.W = this.w;

	}

	public int get_W() {
		return this.W;
	}
	
	public int get_Price() {

		return this.Price;
	}
	
	public int set_cash() {

		return this.cash = this.temp_cash;
	}

	public int get_cash() {

		return this.cash;
	}
}
