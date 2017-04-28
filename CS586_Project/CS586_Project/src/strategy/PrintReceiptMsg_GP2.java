package strategy;

import dataStore.DataStore;
import dataStore.DataStore1;
import dataStore.DataStore2;

public class PrintReceiptMsg_GP2 extends PrintReceiptMsg {

	@Override
	public void PrintReceiptMsg(DataStore dataStore) {
		
        System.out.println("Gas Pump 2:\n");
		
		System.out.println("\nTotal Amount: $" + ((DataStore2)dataStore).get_Total() );
		System.out.println("Quantity:"+ (((DataStore2)dataStore).get_L()-1) + " Liter(s)" );
	}

}
