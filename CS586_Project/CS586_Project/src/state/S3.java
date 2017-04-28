package state;
import applicationDriver.Driver;

public class S3 extends state {
	
	
	public S3(state s) {
		super(s);
	
	}
	
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
		
		if (Driver.gaspump == 1){
		opobj.CancelMsg();
		MDAEFSM.mdaefsmState = (MDAEFSM.getS0State());
		}
		else if(Driver.gaspump == 2){
			opobj.CancelMsg();
			opobj.ReturnCash();
			MDAEFSM.mdaefsmState = (MDAEFSM.getS0State());
		}

	}

	@Override
	public void Approved() {
		

	}

	@Override
	public void SelectGas(int g) {
		
		opobj.SetPrice();
		MDAEFSM.mdaefsmState = (MDAEFSM.getS4State());

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
