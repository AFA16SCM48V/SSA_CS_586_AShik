package abstractFactory;

import dataStore.DataStore;
import dataStore.DataStore1;
import dataStore.DataStore2;
import strategy.StoreCash_GP2;
import strategy.CancelMsg;
import strategy.CancelMsgGP;
import strategy.DisplayMenu;
import strategy.DisplayMenu_GP1;
import strategy.DisplayMenu_GP2;
import strategy.GasPumpedMsg;
import strategy.GasPumpedMsg_GP1;
import strategy.GasPumpedMsg_GP2;
import strategy.PayMsg;
import strategy.PayMsg_GP1;
import strategy.PayMsg_GP2;
import strategy.PayType;
import strategy.PaytypeGP;
import strategy.PrintReceiptMsg;
import strategy.PrintReceiptMsg_GP1;
import strategy.PrintReceiptMsg_GP2;
import strategy.PumpGasUnit;
import strategy.PumpGasUnit_GP1;
import strategy.PumpGasUnit_GP2;
import strategy.ReadyMsg;
import strategy.ReadyMsgGP;
import strategy.RejectMsg;
import strategy.RejectMsgGP;
import strategy.ReturnCash;
import strategy.ReturnCashGP;
import strategy.SetInitialValues;
import strategy.SetInitialValues_GP1;
import strategy.SetInitialValues_GP2;
import strategy.SetPrice;
import strategy.SetPrice_GP1;
import strategy.SetPrice_GP2;
import strategy.StopMsg;
import strategy.StopMsgGP;
import strategy.StoreCash;
import strategy.StoreData;
import strategy.StoreData_GP1;
import strategy.StoreData_GP2;

public class ConcreteFactory2 implements AbstractFactory{
	
	DataStore dataStore = null;
	StoreData storedata = null;
	PayMsg paymsg = null;
	StoreCash storecash = null;
	DisplayMenu displaymenu = null;
	ReadyMsg readymsg = null;
	PumpGasUnit pumpgasunit = null;
	GasPumpedMsg gaspumpedmsg = null;
	StopMsg stopmsg = null;
	PrintReceiptMsg printreceiptmsg = null;
	CancelMsg cancelmsg = null;
	SetInitialValues setinitialvalues  = null;
	PayType paytype = null;
	SetPrice setprice = null;
	ReturnCash returncash = null;
	
	public ConcreteFactory2(){
		dataStore = new DataStore2();
		storedata= new StoreData_GP2();
		paymsg = new PayMsg_GP2();
		storecash = new StoreCash_GP2();
		displaymenu = new DisplayMenu_GP2();
		readymsg = new ReadyMsgGP();
		pumpgasunit = new PumpGasUnit_GP2();
		gaspumpedmsg = new GasPumpedMsg_GP2();
		stopmsg = new StopMsgGP();
		printreceiptmsg = new PrintReceiptMsg_GP2();
		cancelmsg = new CancelMsgGP();
		setinitialvalues = new SetInitialValues_GP2();
		paytype = new PaytypeGP();
		setprice = new SetPrice_GP2();
		returncash = new ReturnCashGP();
	}
	public void ConcreteFactory() {

	}

	public DataStore CreateDataStore() {
		return (dataStore);
	}
	
	public DataStore GetDataStore() {
		return dataStore;
	}
	
	@Override
	public StoreData getStoreData() {

		return storedata;
	}

	@Override
	public PayMsg getPayMsg() {

		return paymsg;
	}

	@Override
	public StoreCash getStoreCash() {

		return storecash;
	}

	@Override
	public DisplayMenu getDisplayMenu() {

		return displaymenu;
	}

	@Override
	public RejectMsg getRejectMsg() {

		return null;
	}

	@Override
	public SetPrice getSetPrice() {

		return setprice;
	}

	@Override
	public ReadyMsg getReadyMsg() {

		return readymsg;
	}

	@Override
	public SetInitialValues getSetInitialValues() {

		return setinitialvalues;
	}

	@Override
	public PumpGasUnit getPumpGasUnit() {

		return pumpgasunit;
	}

	@Override
	public GasPumpedMsg getGasPumpedMsg() {

		return gaspumpedmsg;
	}

	@Override
	public StopMsg getStopMsg() {

		return stopmsg;
	}

	@Override
	public PrintReceiptMsg getPrintReceiptMsg() {

		return printreceiptmsg;
	}

	@Override
	public CancelMsg getCancelMsg() {

		return cancelmsg;
	}

	@Override
	public PayType getPayType() {

		return null;
	}

	@Override
	public ReturnCash getReturnCash() {

		return returncash;
	}

}
