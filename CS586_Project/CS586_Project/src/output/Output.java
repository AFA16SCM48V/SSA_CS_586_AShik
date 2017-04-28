package output;


import abstractFactory.AbstractFactory;
import dataStore.DataStore;
import strategy.CancelMsg;
import strategy.DisplayMenu;
import strategy.GasPumpedMsg;
import strategy.PayMsg;
import strategy.PrintReceiptMsg;
import strategy.PumpGasUnit;
import strategy.ReadyMsg;
import strategy.RejectMsg;
import strategy.SetInitialValues;
import strategy.SetPrice;
import strategy.StopMsg;
import strategy.StoreCash;
import strategy.StoreData;
import strategy.ReturnCash;

public class Output {

	AbstractFactory factory = null;
	DataStore dataStore = null;
	
	
	public Output(AbstractFactory factory, DataStore dataStore) {
		
		//Constructor to initialize the output object
		this.factory = factory;
		this.dataStore = dataStore;
	}
	
	public void StoreData() {
		
		//process the stored data 
		System.out.println("\nGas Pump activated ");
		StoreData storedata = factory.getStoreData();
		storedata.StoreData(dataStore);
	}
	
	public void PayMsg() {
		
		//payment message
		PayMsg paymsg = factory.getPayMsg();
		paymsg.PayMsg();
	}

	public void StoreCash() {
		//store cash 
		StoreCash storecash = factory.getStoreCash();
		storecash.StoreCash(dataStore);
		
	}

	public void DisplayMenu() {
		//display the menu
		DisplayMenu displaymenu = factory.getDisplayMenu();
		displaymenu.DisplayMenu();
		
	}

	public void RejectMsg() {
		//rejection message 
		RejectMsg rejectmsg = factory.getRejectMsg();
		rejectmsg.RejectMsg();
	}

	public void CancelMsg() {
		
		//cancellation message
		CancelMsg cancelmsg = factory.getCancelMsg();
		cancelmsg.cancelmsg();
		
		
	}

	public void SetPrice() {
		//set the price
		SetPrice setprice = factory.getSetPrice();
		setprice.SetPrice(dataStore);
		
	}

	public void SetInitialValues() {
		
		//setting initial values
		SetInitialValues setinitialvalues = factory.getSetInitialValues();
		setinitialvalues.SetInitialValues(dataStore);
		
	}

	public void ReadyMsg() {
		//ready message
		ReadyMsg readymsg = factory.getReadyMsg();
		readymsg.ReadyMsg();
		
	}

	public void PumpGasUnit() {
		//pump gas 
		PumpGasUnit pumpgasunit = factory.getPumpGasUnit();
		pumpgasunit.PumpGasUnit();
		
	}

	public void GasPumpedMsg() {
		
		//pumped message 
		GasPumpedMsg gaspumpedmsg = factory.getGasPumpedMsg();
		gaspumpedmsg.GasPumpedMsg(dataStore);
		
	}

	public void StopMsg() {
		
		//message to stop
		StopMsg stopmsg = factory.getStopMsg();
		stopmsg.StopMsg();
		
	}

	public void PrintReceiptMsg() {
		
		//printing receipt
		System.out.println("\nReceipt: ");
		PrintReceiptMsg printreceiptmsg = factory.getPrintReceiptMsg();
		printreceiptmsg.PrintReceiptMsg(dataStore);
		
	}

	
	public void ReturnCash(){
		
		//return cash to customer
		ReturnCash returncash = factory.getReturnCash();
		returncash.ReturnCash(dataStore);
		
	}

}
