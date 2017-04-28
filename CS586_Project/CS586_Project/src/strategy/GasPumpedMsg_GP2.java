package strategy;

import dataStore.DataStore;
import dataStore.DataStore1;
import dataStore.DataStore2;

public class GasPumpedMsg_GP2 extends GasPumpedMsg {

	@Override
	public void GasPumpedMsg(DataStore dataStore) {
		
		System.out.println(((DataStore2)dataStore).get_L() + " Liters(s) Pumped"  );
		System.out.println("\nPress 9 to Continue Pumping:\n");
	}

}
