package state;

public class S1 extends state {

	MDAEFSM state = null;

	public S1(state s) {
		super(s);
		
	}

	
	public void Activate() {
		

	}

	
	public void Start() {
		

	}

	
	public void PayCredit() {
		
		MDAEFSM.mdaefsmState = (state.getS2State());

	}

	
	public void PayCash() {
		
		opobj.StoreCash();
		opobj.DisplayMenu();
		MDAEFSM.mdaefsmState = (state.getS3State());

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
