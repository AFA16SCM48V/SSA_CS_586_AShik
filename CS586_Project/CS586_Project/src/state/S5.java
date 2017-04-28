package state;

public class S5 extends state {

	public S5(state s) {
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
		
		opobj.PumpGasUnit();
		opobj.GasPumpedMsg();
		MDAEFSM.mdaefsmState = (state.getS5State());

	}

	@Override
	public void StopPump() {
		
		opobj.StopMsg();
		MDAEFSM.mdaefsmState = (state.getS6State());

	}

	@Override
	public void Receipt() {
		

	}

	@Override
	public void NoReceipt() {
		

	}

	@Override
	public void ReturnCash() {
		
		
	}

}
