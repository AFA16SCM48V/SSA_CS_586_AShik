package state;

public class S2 extends state {
	public S2(state s) {
		super(s);
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
		
		opobj.RejectMsg();
		MDAEFSM.mdaefsmState = (state.getS0State());

	}

	@Override
	public void Cancel() {
		

	}

	@Override
	public void Approved() {
		opobj.DisplayMenu();
		MDAEFSM.mdaefsmState = (state.getS3State());

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
		

	}

	@Override
	public void NoReceipt() {
		

	}

	@Override
	public void ReturnCash() {
		
		
	}
}
