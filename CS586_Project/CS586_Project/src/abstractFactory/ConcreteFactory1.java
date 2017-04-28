package abstractFactory;

import dataStore.DataStore;
import dataStore.DataStore1;
import strategy.CancelMsg;
import strategy.CancelMsgGP;
import strategy.DisplayMenu;
import strategy.DisplayMenu_GP1;
import strategy.GasPumpedMsg;
import strategy.GasPumpedMsg_GP1;
import strategy.PayMsg;
import strategy.PayMsg_GP1;
import strategy.PayType;
import strategy.PaytypeGP;
import strategy.PrintReceiptMsg;
import strategy.PrintReceiptMsg_GP1;
import strategy.PumpGasUnit;
import strategy.PumpGasUnit_GP1;
import strategy.ReadyMsg;
import strategy.ReadyMsgGP;
import strategy.RejectMsg;
import strategy.RejectMsgGP;
import strategy.ReturnCash;
import strategy.SetInitialValues;
import strategy.SetInitialValues_GP1;
import strategy.SetPrice;
import strategy.SetPrice_GP1;
import strategy.StopMsg;
import strategy.StopMsgGP;
import strategy.StoreCash;
import strategy.StoreData;
import strategy.StoreData_GP1;

public class ConcreteFactory1 implements AbstractFactory {
	
	//this implements the methods in abstract factory
	DataStore dataStore = new DataStore1();
	StoreData storedata = new StoreData_GP1();
	PayMsg paymsg = new PayMsg_GP1();

	DisplayMenu displaymenu = new DisplayMenu_GP1();
	RejectMsg rejectmsg = new RejectMsgGP();
	ReadyMsg readymsg = new ReadyMsgGP();
	PumpGasUnit pumpgasunit = new PumpGasUnit_GP1();
	GasPumpedMsg gaspumpedmsg = new GasPumpedMsg_GP1();
	StopMsg stopmsg = new StopMsgGP();
	PrintReceiptMsg printreceiptmsg = new PrintReceiptMsg_GP1();
	CancelMsg cancelmsg = new CancelMsgGP();
	SetInitialValues setinitialvalues = new SetInitialValues_GP1();
	PayType paytype = new PaytypeGP();
	SetPrice setprice = new SetPrice_GP1();

	public DataStore CreateDataStore() {
		return (this.dataStore);
	}
	
	public DataStore GetDataStore() {
		return this.dataStore;
	}
	
	@Override
	public StoreData getStoreData() {
		return this.storedata;
	}

	@Override
	public PayMsg getPayMsg() {
		return this.paymsg;
	}

	@Override
	public StoreCash getStoreCash() {
		return null;
	}

	@Override
	public DisplayMenu getDisplayMenu() {
		return this.displaymenu;
	}

	@Override
	public RejectMsg getRejectMsg() {
		return this.rejectmsg;
	}

	@Override
	public SetPrice getSetPrice() {
		return this.setprice;
	}

	@Override
	public ReadyMsg getReadyMsg() {
		return this.readymsg;
	}

	@Override
	public SetInitialValues getSetInitialValues() {
		return this.setinitialvalues;
	}

	@Override
	public PumpGasUnit getPumpGasUnit() {
		return this.pumpgasunit;
	}

	@Override
	public GasPumpedMsg getGasPumpedMsg() {
		return this.gaspumpedmsg;
	}

	@Override
	public StopMsg getStopMsg() {
		return this.stopmsg;
	}

	@Override
	public PrintReceiptMsg getPrintReceiptMsg() {
		return this.printreceiptmsg;
	}

	@Override
	public CancelMsg getCancelMsg() {
		return this.cancelmsg;
	}

	@Override
	public PayType getPayType() {
		return null;
	}
	
	@Override
	public ReturnCash getReturnCash() {
		return null;
	}

}
