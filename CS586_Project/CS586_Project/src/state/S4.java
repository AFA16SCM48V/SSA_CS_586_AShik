package state;

public class S4 extends state {

	public S4(state s) {
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
		
		opobj.SetInitialValues();
		opobj.ReadyMsg();
		MDAEFSM.mdaefsmState = (state.getS5State());

	}

	@Override
	public void Pump() {
		

	}

	@Override
	public void StopPump() {
		

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
