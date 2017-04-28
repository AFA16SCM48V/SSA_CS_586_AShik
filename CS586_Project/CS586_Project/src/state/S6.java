package state;

import applicationDriver.Driver;

public class S6 extends state {

	public S6(state s) {
		super(s);
		//this.state = state;
	}
	
	MDAEFSM state = null;

	
	@Override
	public void Activate() {
		

	}

	@Override
	public void Start() {
		

	}

	@Override
	public void PayCredit() {
		

	}

	@Override
	public void PayCash() {
		

	}

	@Override
	public void Reject() {
		

	}

	@Override
	public void Cancel() {
		

	}

	@Override
	public void Approved() {
		

	}

	@Override
	public void SelectGas(int g) {
		

	}

	@Override
	public void StartPump() {
		

	}

	@Override
	public void Pump() {
		

	}

	@Override
	public void StopPump() {
		
	}
	
	

	@Override
	public void Receipt() {

		if(Driver.gaspump == 1){
			opobj.PrintReceiptMsg();
		}
		else if (Driver.gaspump ==2){
			opobj.PrintReceiptMsg();
			opobj.ReturnCash();
		}
		MDAEFSM.mdaefsmState = (state.getS0State());
	}

	@Override
	public void NoReceipt() {
		
		opobj.ReturnCash();
		MDAEFSM.mdaefsmState = (state.getS0State());

	}

	@Override
	public void ReturnCash() {
		
		
	}

}
