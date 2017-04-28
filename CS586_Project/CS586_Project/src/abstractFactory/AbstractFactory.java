package abstractFactory;

import strategy.*;


public interface AbstractFactory {

	//abstract factory class, concrete factory 1 & 2 implement these methods
	
	public StoreData getStoreData();

	public PayMsg getPayMsg();

	public StoreCash getStoreCash();

	public DisplayMenu getDisplayMenu();

	public RejectMsg getRejectMsg();

	public PayType getPayType();

	public SetPrice getSetPrice();

	public ReadyMsg getReadyMsg();

	public SetInitialValues getSetInitialValues();

	public PumpGasUnit getPumpGasUnit();

	public GasPumpedMsg getGasPumpedMsg();

	public StopMsg getStopMsg();

	public PrintReceiptMsg getPrintReceiptMsg();

	public CancelMsg getCancelMsg();
	
	public ReturnCash getReturnCash();
	
}
