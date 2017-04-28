package strategy;

import dataStore.DataStore;
import dataStore.DataStore1;


public class PrintReceiptMsg_GP1 extends PrintReceiptMsg {
	public void PrintReceiptMsg(DataStore dataStore) {

		System.out.println("Gas Pump 1:\n");		
		System.out.println("Total Amount: $" + ((DataStore1)dataStore).get_Total() );
		System.out.println("Quantity:"+ (((DataStore1)dataStore).get_G()-1) + " Gallon(s)" );
	}

}
