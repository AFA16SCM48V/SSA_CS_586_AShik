package gaspump;

import dataStore.DataStore;
import dataStore.DataStore2;
import state.MDAEFSM;

public class GasPump2 {
	
	MDAEFSM mdaefsmObj = null; // Pointer to MDA-EFSM
	DataStore dataStore = null; // Pointer to DataStore

	public GasPump2(MDAEFSM efsm, DataStore dataStore) {
		
		//constructor to set the MDA-EFSM and DataStore object 
		this.mdaefsmObj = efsm;
		this.dataStore = dataStore;
	}

	public void Activate(int premiumprice, int superprice, int regularprice) {
		
		//check prices and then activate 
		if (premiumprice >0 && superprice > 0 && regularprice >0 ){
			((DataStore2) dataStore).temp_a = premiumprice;
			((DataStore2) dataStore).temp_b = superprice;
			((DataStore2) dataStore).temp_c = regularprice;
			mdaefsmObj.Activate();
		}
		
	}

	public void Start() {
		
		//start the gas pump 
		mdaefsmObj.Start();
	}

	public void PayCash(int cash) {
		
		//check cash and set the payment type
		if (cash > 0){
			((DataStore2) dataStore).temp_cash = cash;
			mdaefsmObj.PayType(2);
		}
		
	}

	public void Cancel() {

		//cancel the operation
		mdaefsmObj.Cancel();
		
	}

	public void Regular() {
		
		//select the regular gas type 
		((DataStore2) dataStore).set_rprice();
		mdaefsmObj.SelectGas(1);

		System.out.println("Regular Gas selected\n");
		
	}

	public void Premium() {
		
		//select the premium gas type 
		((DataStore2) dataStore).set_pprice();
		mdaefsmObj.SelectGas(2);

		System.out.println("Premium Gas selected\n");
		
	}

	public void Super() {
		
		//select the super gas type 
		((DataStore2) dataStore).set_sprice();
		mdaefsmObj.SelectGas(3);

		System.out.println("Super Gas selected\n");
		
	}

	public void StartPump() {
		
		//start the pump 
		mdaefsmObj.StartPump();
		
	}

	public void Pump() {
		
		//pump one liter of gas 
		if (((DataStore2) dataStore).cash < (((DataStore2) dataStore).L + 1)
				* ((DataStore2) dataStore).Price) {
			mdaefsmObj.StopPump();
			System.out.println("Pump Stopped, Insufficient Cash\n");
		} 
		else
			mdaefsmObj.Pump();
		
	}

	public void StopPump() {
		
		//stop the gas pumping 
		mdaefsmObj.StopPump();
	}

	public void Receipt() {
		
		//generate receipt
		mdaefsmObj.Receipt();
	}

	public void NoReceipt() {
		
		//proceed without receipt
		mdaefsmObj.NoReceipt();
	}
	
	

}
