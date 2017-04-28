package strategy;

import dataStore.DataStore;
import dataStore.DataStore1;

public class SetInitialValues_GP1 extends SetInitialValues {
	
	
	public void SetInitialValues(DataStore dataStore) {
		
		((DataStore1)dataStore).set_G(0);
		((DataStore1)dataStore).set_Total(0);
	}
}
