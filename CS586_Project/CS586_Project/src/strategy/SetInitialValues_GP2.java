package strategy;

import dataStore.DataStore;
import dataStore.DataStore1;
import dataStore.DataStore2;

public class SetInitialValues_GP2 extends SetInitialValues {

	@Override
	public void SetInitialValues(DataStore dataStore) {

		((DataStore2)dataStore).set_L(0);
		((DataStore2)dataStore).set_Total(0);
	}

}
