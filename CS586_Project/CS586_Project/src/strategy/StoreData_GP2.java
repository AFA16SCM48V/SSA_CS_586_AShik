package strategy;

import dataStore.DataStore;
import dataStore.DataStore2;

public class StoreData_GP2 extends StoreData {

	@Override
	public void StoreData(DataStore dataStore) {
		
		((DataStore2)dataStore).set_premium_price();
		((DataStore2)dataStore).set_super_price();
		((DataStore2)dataStore).set_regular_price();
		
	}

}
