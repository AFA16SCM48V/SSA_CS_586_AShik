package state;

public class S0 extends state {
	
	state s = null;

	public S0(state s) {
		super(s);
	}
	

	public void Activate() {
		

	}

	
	public void Start() {
		

		opobj.PayMsg();
		MDAEFSM.mdaefsmState = (MDAEFSM.getS1State());
	}

	
	public void PayCredit() {
		

	}

	
	public void PayCash() {
		

	}

	
	public void Reject() {
		

	}

	
	public void Cancel() {
		

	}

	
	public void Approved() {
		

	}

	
	public void SelectGas(int g) {
		

	}

	
	public void StartPump() {
		

	}

	
	public void Pump() {
		

	}

	
	public void StopPump() {
		

	}

	
	public void Receipt() {
		

	}

	
	public void NoReceipt() {
		

	}


	@Override
	public void ReturnCash() {
		
		
	}

}
