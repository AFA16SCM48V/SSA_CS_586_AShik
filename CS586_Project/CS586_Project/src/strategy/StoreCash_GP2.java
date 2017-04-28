package strategy;

import dataStore.DataStore;
import dataStore.DataStore2;

public class StoreCash_GP2 extends StoreCash {

	@Override

	public void StoreCash(DataStore dataStore) {
		((DataStore2) dataStore).set_cash();
		System.out.println("Gas Pump 3:: Cash Stored: $" + ((DataStore2) dataStore).get_cash());
	}

}
