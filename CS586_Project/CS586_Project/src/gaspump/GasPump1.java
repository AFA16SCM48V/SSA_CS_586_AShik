package gaspump;

import dataStore.DataStore;
import dataStore.DataStore1;

import state.MDAEFSM;

public class GasPump1 {


		MDAEFSM mdaefsmObj = null; // Pointer to MDA-EFSM object

		DataStore dataStore = null; // Pointer to DataStore

		public GasPump1(MDAEFSM mdaefsmObj, DataStore dataStore) {
			
			//constructor for gaspump 
			this.mdaefsmObj = mdaefsmObj;
			this.dataStore = dataStore;
		}

		public void Activate(float superprice, float regularprice) {
			
			//check the prices and activate the gas pump
			if (superprice > 0 && regularprice > 0)
				((DataStore1) dataStore).temp_a = superprice;
			    ((DataStore1) dataStore).temp_b = regularprice;

			mdaefsmObj.Activate();
		}
		

		public void Start() {
			
			//start the gas pump
			mdaefsmObj.Start();
		}

		public void PayCredit() {
			
			//set the payment type 
			mdaefsmObj.PayType(1);
			System.out.println("Received card details \n 4 -> Reject , 5-> Cancel , 6-> Approved\n");
		}

		public void Reject() {
			
			//reject the payment
			mdaefsmObj.Reject();
			
		}

		public void Cancel() {
			
			//cancel the operation
			mdaefsmObj.Cancel();
			
		}

		public void Approved() {
			
			//approve the payment
			mdaefsmObj.Approved();
			
		}

		public void Regular() {
			
			//select the regular gas type and set variable 
			((DataStore1) dataStore).set_rprice();
			mdaefsmObj.SelectGas(1);

			System.out.println("Regular Gas selected\n");
			
		}

		public void Super() {
			
			//select the super gas type and set variable 
			((DataStore1) dataStore).set_sprice();
			mdaefsmObj.SelectGas(2);

			System.out.println("Super Gas selected\n");
			
		}

		public void StartPump() {
			
			//start the pump
			mdaefsmObj.StartPump();
		}

		public void Pump() {
		
			//pump one gallon of gas 
			mdaefsmObj.Pump();
		}

		public void StopPump() {
			
			//stop the pump and generate receipt
			mdaefsmObj.StopPump();
			mdaefsmObj.Receipt();
			
		}
		
		
		
	}


